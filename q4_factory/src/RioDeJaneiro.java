public class RioDeJaneiro extends Localizacao {
    @Override
    Inimigo criarInimigo() {
        return new Criminosos();
    }
}
