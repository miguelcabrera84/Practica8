/**
 * Clase que representa un objeto util que puede ser usado por el jugador.
 * Implementa la interfaz ElementoDinamico.
 */
public class Utileria implements ElementoDinamico {
    private String nombre;
    private String descripcion;
    private int posicionX;
    private int posicionY;
    private boolean usada;

    /**
     * Constructor de la clase Utileria.
     *
     * @param nombre Nombre de la utileria
     * @param descripcion Descripcion del objeto
     * @param posicionX Coordenada X inicial
     * @param posicionY Coordenada Y inicial
     */
    public Utileria(String nombre, String descripcion, int posicionX, int posicionY) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.usada = false;
    }

    /**
     * Obtiene el nombre de la utileria.
     *
     * @return Nombre de la utileria
     */
    public String getNombre() { return nombre; }

    /**
     * Obtiene la descripcion de la utileria.
     *
     * @return Descripcion del objeto
     */
    public String getDescripcion() { return descripcion; }

    /**
     * Obtiene la coordenada X de la utileria.
     *
     * @return Coordenada X
     */
    public int getPosicionX() { return posicionX; }

    /**
     * Obtiene la coordenada Y de la utileria.
     *
     * @return Coordenada Y
     */
    public int getPosicionY() { return posicionY; }

    /**
     * Verifica si la utileria ha sido usada.
     *
     * @return true si ha sido usada, false en caso contrario
     */
    public boolean isUsada() { return usada; }

    /**
     * Usa la utileria, ejecutando su accion.
     */
    public void usar() {
        if (!usada) {
            this.usada = true;
            System.out.println("Usando: " + nombre + " - " + descripcion);
        }
    }

    @Override
    public void mover(String direccion, int distancia) {
        switch (direccion.toLowerCase()) {
            case "norte": posicionY += distancia; break;
            case "sur": posicionY -= distancia; break;
            case "este": posicionX += distancia; break;
            case "oeste": posicionX -= distancia; break;
            default: System.out.println("Direccion no valida"); return;
        }
        System.out.println("Utileria '" + nombre + "' se movio " + distancia + " hacia " + direccion +
                ". Nueva posicion: (" + posicionX + ", " + posicionY + ")");
    }
}