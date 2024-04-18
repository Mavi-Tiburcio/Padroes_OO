public class Sertao extends Localizacao {
    @Override
    Inimigo criarInimigo() {
        return new Cangaceiros();
    }
}
