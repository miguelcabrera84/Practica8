/**
 * Interfaz que define los elementos que pueden moverse dentro del nivel.
 */
public interface ElementoDinamico {

    /**
     * Mueve el elemento en una direccion y distancia especificada.
     *
     * @param direccion Direccion del movimiento (norte, sur, este, oeste)
     * @param distancia Distancia a mover en unidades
     */
    void mover(String direccion, int distancia);
}