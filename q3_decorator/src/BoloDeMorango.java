public class BoloDeMorango extends Bolo {
    public int getCost() {
        return super.getCost() * 2;  // O custo do bolo de morango é o dobro do custo base
    }

    public String getDescription() {
        return "Bolo de Morango";
    }
}
