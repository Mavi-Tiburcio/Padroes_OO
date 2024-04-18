public class App {

    public static void main(String[] args) {
        Composto carro = new Composto("Carro");
        Composto carroceria = new Composto("Carroceria");
        Composto chassi = new Composto("Chassi");
        Composto tremDeForca= new Composto("Trem de Força");

        Partes portas = new Partes("Portas", 50);
        Partes paineis = new Partes("Painéis", 30);
        Partes portaMalas = new Partes("Porta-malas", 25);
        Partes capo = new Partes("Capô", 20);
        Partes paraLamas= new Partes("Para-Lamas", 20);

        Partes suspensao= new Partes("Suspensão",15);

        Partes motor = new Partes("Motor", 300);
        Partes transmissao = new Partes("Transmissão", 110);
        Partes diferencial = new Partes("Diferencial", 70);
        Partes rodas = new Partes("Rodas", 40);

        carroceria.adicionar(portas);
        carroceria.adicionar(paineis);
        carroceria.adicionar(portaMalas);
        carroceria.adicionar(capo);
        carroceria.adicionar(paraLamas);

        tremDeForca.adicionar(motor);
        tremDeForca.adicionar(transmissao);
        tremDeForca.adicionar(diferencial);
        tremDeForca.adicionar(rodas);

        chassi.adicionar(tremDeForca);
        chassi.adicionar(suspensao);

        carro.adicionar(carroceria);
        carro.adicionar(chassi);

        float pesoTotal = carro.getPeso();
        System.out.println("\nO peso total do carro é: " + pesoTotal);
    }
}
