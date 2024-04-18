public class App {
    public static void main(String[] args) {
        ModeloTelefone model = new ModeloTelefone();
        Tela tela = new Tela();
        Teclado teclado = new Teclado(model);

        model.registerObservar(new ObservarDigito(tela));
        model.registerObservar(new ObservarDiscagem(tela, model));

        teclado.simularPresionamentoTecla(12);  // Simula 12 pressionamentos de tecla
    }
}
