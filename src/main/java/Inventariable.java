/**
 * Interfaz que define los elementos que pueden ser almacenados en un inventario.
 * Proporciona metodos para registrar y eliminar elementos.
 */
public interface Inventariable {

    /**
     * Registra el elemento en el sistema.
     */
    void registrar();

    /**
     * Elimina el elemento del sistema.
     */
    void borrar();
}