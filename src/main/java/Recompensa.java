/**
 * Clase que representa una recompensa que puede ser obtenida por el jugador.
 * Implementa la interfaz Inventariable.
 */
public class Recompensa implements Inventariable {
    private String nombre;
    private int valor;
    private String tipo;

    /**
     * Constructor de la clase Recompensa.
     *
     * @param nombre Nombre de la recompensa
     * @param valor Valor numerico de la recompensa
     * @param tipo Tipo de recompensa (ej: tesoro, experiencia, etc.)
     */
    public Recompensa(String nombre, int valor, String tipo) {
        this.nombre = nombre;
        this.valor = valor;
        this.tipo = tipo;
    }

    /**
     * Obtiene el nombre de la recompensa.
     *
     * @return Nombre de la recompensa
     */
    public String getNombre() { return nombre; }

    /**
     * Obtiene el valor de la recompensa.
     *
     * @return Valor numerico
     */
    public int getValor() { return valor; }

    /**
     * Obtiene el tipo de recompensa.
     *
     * @return Tipo de recompensa
     */
    public String getTipo() { return tipo; }

    @Override
    public void registrar() {
        System.out.println("Recompensa registrada: " + nombre);
    }

    @Override
    public void borrar() {
        System.out.println("Recompensa borrada: " + nombre);
    }
}