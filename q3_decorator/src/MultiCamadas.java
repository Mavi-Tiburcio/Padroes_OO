public class MultiCamadas extends Decoracao {
    public MultiCamadas(Bolo bolo) {
        super(bolo);
    }

    public String getDescription() {
        return "Bolo multicamadas " + bolo.getDescription();
    }

    public int getCost() {
        return bolo.getCost() + 5;
    }
}
