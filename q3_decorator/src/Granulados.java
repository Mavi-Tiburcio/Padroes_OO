public class Granulados extends Decoracao {
    public Granulados(Bolo bolo) {
        super(bolo);
    }

    public String getDescription() {
        return bolo.getDescription() + " com granulado";
    }

    public int getCost() {
        return bolo.getCost() + 2;
    }
}
