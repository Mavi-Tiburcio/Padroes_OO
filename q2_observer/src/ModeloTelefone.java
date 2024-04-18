import java.util.ArrayList;
import java.util.List;

public class ModeloTelefone {
    private String numero = "";
    private List<Observar> observadores = new ArrayList<>();

    public void addDigit(char digit) {
        numero += digit;  // Adiciona o novo dígito ao número
        notifyObservadores();  // Notifica todos os observadores sobre a mudança
    }

    private void notifyObservadores() {
        for (Observar observador : observadores) {
            observador.update(numero);  // Passa o estado atual do número para os observadores
        }
    }

    public void registerObservar(Observar observador) {
        observadores.add(observador);
    }

    public String getNumero() {
        return numero;
    }
}
