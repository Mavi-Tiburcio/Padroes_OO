public class Partes implements Componente {
    private String nome;
    private float peso;

    public Partes(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public void adicionar(Componente componente) {
        // Não faz nada, pois é uma folha sem subcomponentes.
    }

    @Override
    public float getPeso() {
        System.out.println("Somando agora o peso de " + nome + ": " + peso + ".");
        return peso;
    }

    @Override
    public String getNome() {
        return nome;
    }
}