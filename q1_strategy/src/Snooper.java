public class Snooper {
    private String tipo;

    public Snooper(String tipo) {
        this.tipo = tipo;
    }

    public void notificar(String consulta) {
        if ("amigo".equals(tipo)) {
            System.out.println("Oh Yes! " + consulta);
        } else if ("tamanho".equals(tipo)) {
            System.out.println("So long.... " + consulta);
        }
    }
}
