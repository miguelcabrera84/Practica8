/**
 * Clase principal que ejecuta el juego.
 * Crea un nivel con todos sus atributos y ejecuta el movimiento de elementos dinamicos.
 */
public class Main {

    /**
     * Metodo principal que inicia la ejecucion del programa.
     *
     * @param args Argumentos de linea de comandos
     */
    public static void main(String[] args) {
        Inventario inventario = new Inventario(5);

        Arma espada = new Arma("Espada Larga", 15, 2.5);
        Arma arco = new Arma("Arco Elfico", 12, 8.0);
        Recompensa gemas = new Recompensa("Gemas Rojas", 100, "Tesoro");

        inventario.agregarItem(espada);
        inventario.agregarItem(arco);
        inventario.agregarItem(gemas);

        Nivel nivel = new Nivel("Bosque Encantado", 1, "Normal", inventario);

        nivel.agregarObstaculo(new Obstáculo("Arbol Caido", 10, 5, 10));
        nivel.agregarObstaculo(new Obstáculo("Roca Grande", 20, 12, 15));

        nivel.agregarCheckPoint(new CheckPoint("Entrada", 0, 0));
        nivel.agregarCheckPoint(new CheckPoint("Claro del Bosque", 20, 25));

        Personaje heroe = new Personaje("Aragorn", 100, 10, 10);
        Utileria pocion = new Utileria("Pocion de Vida", "Recupera 50 HP", 8, 5);
        Utileria llave = new Utileria("Llave Dorada", "Abre puertas", 15, 12);

        nivel.agregarElementoDinamico(heroe);
        nivel.agregarElementoDinamico(pocion);
        nivel.agregarElementoDinamico(llave);

        nivel.mostrarEstado();

        nivel.moverElementosDinamicos();

        nivel.mostrarEstado();
    }
}