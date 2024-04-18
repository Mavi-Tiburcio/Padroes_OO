public class App {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.addBolo(new BoloDeChocolate());
        pedido.addBolo(new Escolhido(new BoloDeBaunilha(), "PLAIN!"));
        pedido.addBolo(new Escolhido(new Granulados(new BoloDeBaunilha()), "FANCY"));
        pedido.addBolo(new Escolhido(
            new Escolhido(
                new Granulados(
                    new Granulados(
                        new MultiCamadas(new BoloDeMorango()))),
                "One of"),
            "EVERYTHING"));

        pedido.printOrder();
    }
}
