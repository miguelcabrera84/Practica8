/**
 * Clase que representa un obstaculo en el nivel.
 * Implementa la interfaz Destruible.
 */
public class Obstáculo implements Destruible {
    private String nombre;
    private int daño;
    private int posX;
    private int posY;
    private boolean destruido;

    /**
     * Constructor de la clase Obstaculo.
     *
     * @param nombre Nombre del obstaculo
     * @param daño Daño que causa al colisionar
     * @param posX Coordenada X en el nivel
     * @param posY Coordenada Y en el nivel
     */
    public Obstáculo(String nombre, int daño, int posX, int posY) {
        this.nombre = nombre;
        this.daño = daño;
        this.posX = posX;
        this.posY = posY;
        this.destruido = false;
    }

    /**
     * Obtiene el nombre del obstáculo.
     *
     * @return Nombre del obstaculo
     */
    public String getNombre() { return nombre; }

    /**
     * Obtiene el daño del obstáculo..
     *
     * @return Cantidad de daño
     */
    public int getDaño() { return daño; }

    /**
     * Obtiene la coordenada X del obstáculo.
     *
     * @return Coordenada X
     */
    public int getPosicionX() { return posX; }

    /**
     * Obtiene la coordenada Y del obstáculo.
     *
     * @return Coordenada Y
     */
    public int getPosicionY() { return posY; }

    /**
     * Verifica si el obstáculo. ha sido destruido.
     *
     * @return true si esta destruido, false en caso contrario
     */
    public boolean isDestruido() { return destruido; }

    @Override
    public void destruye() {
        if (!destruido) {
            this.destruido = true;
            System.out.println("obstáculo '" + nombre + "' ha sido destruido.");
        } else {
            System.out.println("obstáculo '" + nombre + "' ya estaba destruido.");
        }
    }
}