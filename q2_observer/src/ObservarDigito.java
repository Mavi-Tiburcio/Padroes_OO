public class ObservarDigito implements Observar {
    private Tela tela;

    public ObservarDigito(Tela tela) {
        this.tela = tela;
    }

    @Override
    public void update(String numero) {
        // Exibe o último dígito adicionado
        char ultimoDigito = numero.charAt(numero.length() - 1);
        tela.display(String.valueOf(ultimoDigito));
    }
}
