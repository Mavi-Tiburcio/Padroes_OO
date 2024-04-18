import java.util.ArrayList;
import java.util.List;

public class ModeloDePesquisa {
    private List<Snooper> snoopers = new ArrayList<>();
    private List<FiltroDeConsulta> filters = new ArrayList<>();

    public void registerSnooper(Snooper snooper, FiltroDeConsulta filter) {
        snoopers.add(snooper);
        filters.add(filter);
    }

    public void notifySnoopers(String query) {
        for (int i = 0; i < snoopers.size(); i++) {
            if (filters.get(i).deveNotificar(query)) {
                snoopers.get(i).notificar(query);
            }
        }
    }
}
