/**
 * Clase que representa un arma que puede ser equipada por el jugador.
 * Implementa la interfaz Inventariable.
 */
public class Arma implements Inventariable {
    private String nombre;
    private int daño;
    private double alcance;

    /**
     * Constructor de la clase Arma.
     *
     * @param nombre Nombre del arma
     * @param daño Cantidad de daño que causa
     * @param alcance Distancia maxima de ataque
     */
    public Arma(String nombre, int daño, double alcance) {
        this.nombre = nombre;
        this.daño = daño;
        this.alcance = alcance;
    }

    /**
     * Obtiene el nombre del arma.
     *
     * @return Nombre del arma
     */
    public String getNombre() { return nombre; }

    /**
     * Obtiene el daño del arma.
     *
     * @return Cantidad de daño
     */
    public int getDaño() { return daño; }

    /**
     * Obtiene el alcance del arma.
     *
     * @return Alcance del arma
     */
    public double getAlcance() { return alcance; }

    @Override
    public void registrar() {
        System.out.println("Arma registrada: " + nombre);
    }

    @Override
    public void borrar() {
        System.out.println("Arma borrada: " + nombre);
    }
}