public class FiltroTamanho implements FiltroDeConsulta {
    @Override
    public boolean deveNotificar(String consulta) {
        return consulta.length() > 60;
    }
}