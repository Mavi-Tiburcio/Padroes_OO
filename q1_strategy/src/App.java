import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        ModeloDePesquisa model = new ModeloDePesquisa();
        model.registerSnooper(new Snooper("friend"), new FiltroAmigo());
        model.registerSnooper(new Snooper("tamanho"), new FiltroTamanho());

        try (BufferedReader reader = Files.newBufferedReader(Paths.get("Hamlet.txt"), StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                model.notifySnoopers(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}