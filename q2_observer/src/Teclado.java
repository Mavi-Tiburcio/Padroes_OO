import java.util.Random;

public class Teclado {
    private ModeloTelefone model;

    public Teclado(ModeloTelefone model) {
        this.model = model;
    }

    public void simularPresionamentoTecla(int numeroPressionado) {
        Random rnd = new Random();
        for (int i = 0; i < numeroPressionado; i++) {
            char newDigit = (char) ('0' + rnd.nextInt(10));
            System.out.println("Pressionando: " + newDigit);
            model.addDigit(newDigit);
        }
    }
}
