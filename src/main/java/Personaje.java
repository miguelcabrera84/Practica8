/**
 * Clase que representa al personaje principal del juego.
 * Implementa las interfaces Destruible y ElementoDinamico.
 */
public class Personaje implements Destruible, ElementoDinamico {
    private String nombre;
    private int vida;
    private int posicionX;
    private int posicionY;
    private boolean destruido;

    /**
     * Constructor de la clase Personaje.
     *
     * @param nombre Nombre del personaje
     * @param vida Cantidad de vida inicial
     * @param posicionX Coordenada X inicial
     * @param posicionY Coordenada Y inicial
     */
    public Personaje(String nombre, int vida, int posicionX, int posicionY) {
        this.nombre = nombre;
        this.vida = vida;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.destruido = false;
    }

    /**
     * Obtiene el nombre del personaje.
     *
     * @return Nombre del personaje
     */
    public String getNombre() { return nombre; }

    /**
     * Obtiene la vida actual del personaje.
     *
     * @return Vida actual
     */
    public int getVida() { return vida; }

    /**
     * Obtiene la coordenada X del personaje.
     *
     * @return Coordenada X
     */
    public int getPosicionX() { return posicionX; }

    /**
     * Obtiene la coordenada Y del personaje.
     *
     * @return Coordenada Y
     */
    public int getPosicionY() { return posicionY; }

    /**
     * Verifica si el personaje ha sido destruido.
     *
     * @return true si esta destruido, false en caso contrario
     */
    public boolean isDestruido() { return destruido; }

    /**
     * Establece la posicion del personaje.
     *
     * @param x Nueva coordenada X
     * @param y Nueva coordenada Y
     */
    public void setPosicion(int x, int y) {
        this.posicionX = x;
        this.posicionY = y;
    }

    /**
     * Aplica daño al personaje.
     *
     * @param daño Cantidad de daño a aplicar
     */
    public void recibirDaño(int daño) {
        if (!destruido) {
            this.vida -= daño;
            System.out.println("Personaje '" + nombre + "' recibe " + daño + " de daño. Vida restante: " + vida);
            if (vida <= 0) {
                destruye();
            }
        }
    }

    @Override
    public void destruye() {
        if (!destruido) {
            this.destruido = true;
            System.out.println("Personaje '" + nombre + "' ha sido destruido.");
        }
    }

    @Override
    public void mover(String direccion, int distancia) {
        if (destruido) {
            System.out.println("El personaje esta destruido y no puede moverse.");
            return;
        }

        switch (direccion.toLowerCase()) {
            case "norte": posicionY += distancia; break;
            case "sur": posicionY -= distancia; break;
            case "este": posicionX += distancia; break;
            case "oeste": posicionX -= distancia; break;
            default: System.out.println("Direccion no valida"); return;
        }
        System.out.println("Personaje '" + nombre + "' se movio " + distancia + " hacia " + direccion +
                ". Nueva posicion: (" + posicionX + ", " + posicionY + ")");
    }
}