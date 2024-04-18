public class FiltroAmigo implements FiltroDeConsulta {
    @Override
    public boolean deveNotificar(String consulta) {
        return consulta.toLowerCase().contains("friend");
    }
}
