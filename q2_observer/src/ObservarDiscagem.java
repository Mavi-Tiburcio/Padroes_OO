public class ObservarDiscagem implements Observar {
    private Tela tela;
    private ModeloTelefone modelo;

    public ObservarDiscagem(Tela tela, ModeloTelefone modelo) {
        this.tela = tela;
        this.modelo = modelo;
    }

    @Override
    public void update(String numero) {
        if (numero.length() == 12) {
            tela.display("Agora discando " + modelo.getNumero() + "...");
        }
    }
}
