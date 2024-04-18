import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o local para simular o ataque:");
        System.out.println("1 - Amazônia");
        System.out.println("2 - Sertão");
        System.out.println("3 - Rio de Janeiro");
        System.out.print("Digite o número do local: ");
        
        int escolha = scanner.nextInt();
        
        Localizacao localizacao;

        switch (escolha) {
            case 1:
                localizacao = new Amazonia();
                break;
            case 2:
                localizacao = new Sertao();
                break;
            case 3:
                localizacao = new RioDeJaneiro();
                break;
            default:
                System.out.println("Escolha inválida! Simulação cancelada.");
                scanner.close();
                return;
        }

        localizacao.simularAtaque();
        scanner.close();
    }
}
