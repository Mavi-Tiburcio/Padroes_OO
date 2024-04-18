public class ObservarDiscagem implements Observar {
    private Tela tela;
    private ModeloTelefone model;

    public ObservarDiscagem(Tela tela, ModeloTelefone model) { // criar um novo observador de discagem
        this.tela = tela;
        this.model = model;
    }

    @Override
    public void update(String numero) {
        if (numero.length() == 12) {
            tela.display("Agora discando " + model.getNumero() + "...");
        }
    }
}
