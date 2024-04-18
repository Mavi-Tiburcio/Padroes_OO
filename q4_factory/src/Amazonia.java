public class Amazonia extends Localizacao {
    @Override
    Inimigo criarInimigo() {
        return new Animais_Mutantes();
    }
}
