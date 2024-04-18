public class Escolhido extends Decoracao {
    private String escolhido;

    public Escolhido(Bolo bolo, String escolhido) {
        super(bolo);
        this.escolhido = escolhido;
    }

    public String getDescription() {
        return bolo.getDescription() + " com dizer '" + escolhido + "'";
    }

    public int getCost() {
        return bolo.getCost();  // Sem custo adicional
    }
}
