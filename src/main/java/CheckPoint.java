/**
 * Clase que representa un punto de control en el nivel.
 * Permite al jugador guardar su progreso.
 */
public class CheckPoint {
    private String nombre;
    private int posicionX;
    private int posicionY;
    private boolean activado;

    /**
     * Constructor de la clase CheckPoint.
     *
     * @param nombre Identificador del checkpoint
     * @param posicionX Coordenada X en el nivel
     * @param posicionY Coordenada Y en el nivel
     */
    public CheckPoint(String nombre, int posicionX, int posicionY) {
        this.nombre = nombre;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.activado = false;
    }

    /**
     * Obtiene el nombre del checkpoint.
     *
     * @return Nombre del checkpoint
     */
    public String getNombre() { return nombre; }

    /**
     * Obtiene la coordenada X del checkpoint.
     *
     * @return Coordenada X
     */
    public int getPosicionX() { return posicionX; }

    /**
     * Obtiene la coordenada Y del checkpoint.
     *
     * @return Coordenada Y
     */
    public int getPosicionY() { return posicionY; }

    /**
     * Verifica si el checkpoint ha sido activado.
     *
     * @return true si esta activado, false en caso contrario
     */
    public boolean isActivado() { return activado; }

    /**
     * Activa el checkpoint.
     */
    public void activar() {
        if (!activado) {
            this.activado = true;
            System.out.println("Checkpoint '" + nombre + "' activado.");
        } else {
            System.out.println("Checkpoint '" + nombre + "' ya estaba activado.");
        }
    }
}