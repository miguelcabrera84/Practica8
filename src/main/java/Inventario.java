import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa el inventario del jugador.
 * Almacena objetos que implementan la interfaz Inventariable.
 */
public class Inventario {
    private int capacidadMaxima;
    private List<Inventariable> items;

    /**
     * Constructor de la clase Inventario.
     *
     * @param capacidadMaxima Numero maximo de items que puede contener
     */
    public Inventario(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.items = new ArrayList<Inventariable>();
    }

    /**
     * Obtiene la capacidad maxima del inventario.
     *
     * @return Capacidad maxima
     */
    public int getCapacidadMaxima() { return capacidadMaxima; }

    /**
     * Obtiene la lista de items del inventario.
     *
     * @return Lista de items inventariables
     */
    public List<Inventariable> getItems() { return items; }

    /**
     * Agrega un item al inventario.
     *
     * @param item Item a agregar
     * @return true si se agrego correctamente, false si el inventario esta lleno
     */
    public boolean agregarItem(Inventariable item) {
        if (items.size() < capacidadMaxima) {
            items.add(item);
            item.registrar();
            return true;
        }
        System.out.println("Inventario lleno. Capacidad: " + capacidadMaxima);
        return false;
    }

    /**
     * Elimina un item del inventario.
     *
     * @param item Item a eliminar
     * @return true si se elimino correctamente, false si el item no existe
     */
    public boolean eliminarItem(Inventariable item) {
        if (items.remove(item)) {
            item.borrar();
            return true;
        }
        System.out.println("Item no encontrado.");
        return false;
    }

    /**
     * Muestra todos los items actualmente en el inventario.
     */
    public void listarItems() {
        if (items.isEmpty()) {
            System.out.println("Inventario vacio.");
            return;
        }
        System.out.println("+++ ITEMS EN INVENTARIO +++");
        for (Inventariable item : items) {
            if (item instanceof Arma) {
                Arma a = (Arma) item;
                System.out.println("- Arma: " + a.getNombre() + " (Daño: " + a.getDaño() + ")");
            } else if (item instanceof Recompensa) {
                Recompensa r = (Recompensa) item;
                System.out.println("- Recompensa: " + r.getNombre() + " (Valor: " + r.getValor() + ")");
            }
        }
    }
}