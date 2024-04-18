import java.util.ArrayList;
import java.util.List;

/**
 * Store a collection of cakes being ordered by a customer
 */
public class Pedido {
    private final List<Bolo> bolos = new ArrayList<>();

    public void addBolo(Bolo bolo) {
        bolos.add(bolo);
    }

    public void printOrder() {
        for (Bolo bolo : bolos) {
            System.out.printf("   %2d  %s\n", bolo.getCost(), bolo.getDescription());
        }
    }
}