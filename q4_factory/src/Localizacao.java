public abstract class Localizacao {
    abstract Inimigo criarInimigo();

    public void simularAtaque() {
        Inimigo inimigo = criarInimigo();
        inimigo.atacar();
    }
}