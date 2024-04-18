import java.util.ArrayList;
import java.util.List;

public class Composto implements Componente {
    private String nome;
    private List<Componente> componentes = new ArrayList<>();

    public Composto(String nome) {
        this.nome = nome;
    }

    @Override
    public void adicionar(Componente componente) {
        componentes.add(componente);
    }

    @Override
    public float getPeso() {
        float total = 0;
        for (Componente componente : componentes) {
            total += componente.getPeso();
        }
        System.out.println("Total parcial para " + nome + ": " + total);
        return total;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
