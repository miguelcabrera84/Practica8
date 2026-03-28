import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clase que representa un nivel del juego.
 * Contiene obstaculos, checkpoints, elementos dinamicos y un inventario asociado.
 */
public class Nivel {
    private String nombre;
    private int numero;
    private String dificultad;
    private List<Obstáculo> obstaculos;
    private List<CheckPoint> checkPoints;
    private List<ElementoDinamico> elementosDinamicos;
    private Inventario inventario;

    /**
     * Constructor de la clase Nivel.
     *
     * @param nombre Nombre del nivel
     * @param numero Numero del nivel
     * @param dificultad Dificultad del nivel (facil, normal, dificil)
     * @param inventario Inventario asociado al nivel
     */
    public Nivel(String nombre, int numero, String dificultad, Inventario inventario) {
        this.nombre = nombre;
        this.numero = numero;
        this.dificultad = dificultad;
        this.obstaculos = new ArrayList<Obstáculo>();
        this.checkPoints = new ArrayList<CheckPoint>();
        this.elementosDinamicos = new ArrayList<ElementoDinamico>();
        this.inventario = inventario;
    }

    /**
     * Obtiene el nombre del nivel.
     *
     * @return Nombre del nivel
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el numero del nivel.
     *
     * @return Numero del nivel
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Obtiene la dificultad del nivel.
     *
     * @return Dificultad del nivel
     */
    public String getDificultad() {
        return dificultad;
    }

    /**
     * Obtiene la lista de elementos dinamicos del nivel.
     *
     * @return Lista de elementos dinamicos
     */
    public List<ElementoDinamico> getElementosDinamicos() {
        return elementosDinamicos;
    }

    /**
     * Agrega un obstaculo al nivel.
     *
     * @param obstaculo Obstaculo a agregar
     */
    public void agregarObstaculo(Obstáculo obstaculo) {
        obstaculos.add(obstaculo);
    }

    /**
     * Agrega un checkpoint al nivel.
     *
     * @param checkPoint Checkpoint a agregar
     */
    public void agregarCheckPoint(CheckPoint checkPoint) {
        checkPoints.add(checkPoint);
    }

    /**
     * Agrega un elemento dinamico al nivel.
     *
     * @param elemento Elemento dinamico a agregar (Personaje o Utileria)
     */
    public void agregarElementoDinamico(ElementoDinamico elemento) {
        elementosDinamicos.add(elemento);
    }

    /**
     * Mueve todos los elementos dinamicos del nivel de forma aleatoria.
     * Cada elemento se mueve en una direccion aleatoria (norte, sur, este, oeste)
     * y una distancia aleatoria entre 1 y 10 unidades.
     */
    public void moverElementosDinamicos() {
        if (elementosDinamicos.isEmpty()) {
            System.out.println("No hay elementos dinámicos en el nivel.");
            return;
        }

        Random random = new Random();
        String[] direcciones = {"norte", "sur", "este", "oeste"};

        System.out.println("\n--- Moviendo elementos dinámicos del nivel: " + nombre + " ---");
        for (ElementoDinamico elemento : elementosDinamicos) {
            String direccion = direcciones[random.nextInt(direcciones.length)];
            int distancia = random.nextInt(10) + 1;
            elemento.mover(direccion, distancia);
            System.out.println("----------------------------------------");
        }
        System.out.println("--- Fin del movimiento ---\n");
    }

    /**
     * Muestra el estado actual del nivel.
     * Incluye informacion de nombre, numero, dificultad,
     * obstaculos, checkpoints, elementos dinamicos e inventario.
     */
    public void mostrarEstado() {
        System.out.println("\n=== ESTADO DEL NIVEL ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Número: " + numero);
        System.out.println("Dificultad: " + dificultad);

        System.out.println("Obstáculos (" + obstaculos.size() + "):");
        for (Obstáculo o : obstaculos) {
            System.out.println("  - " + o.getNombre() + " (Daño: " + o.getDaño() +
                    ") Pos: (" + o.getPosicionX() + ", " + o.getPosicionY() +
                    ") Destruido: " + o.isDestruido());
        }

        System.out.println("Checkpoints (" + checkPoints.size() + "):");
        for (CheckPoint cp : checkPoints) {
            System.out.println("  - " + cp.getNombre() + " Pos: (" + cp.getPosicionX() +
                    ", " + cp.getPosicionY() + ") Activado: " + cp.isActivado());
        }

        System.out.println("Elementos Dinámicos (" + elementosDinamicos.size() + "):");
        for (ElementoDinamico e : elementosDinamicos) {
            if (e instanceof Personaje) {
                Personaje p = (Personaje) e;
                System.out.println("  - Personaje: " + p.getNombre() +
                        " (Vida: " + p.getVida() +
                        ") Pos: (" + p.getPosicionX() + ", " + p.getPosicionY() +
                        ") Destruido: " + p.isDestruido());
            } else if (e instanceof Utileria) {
                Utileria u = (Utileria) e;
                System.out.println("  - Utilería: " + u.getNombre() +
                        " Pos: (" + u.getPosicionX() + ", " + u.getPosicionY() +
                        ") Usada: " + u.isUsada());
            }
        }

        System.out.println("Inventario:");
        inventario.listarItems();
        System.out.println("=========================\n");
    }
}