package programas.tarefa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class TarefaRepository {
    public void salvarTarefa(List<Tarefa> tarefas, Path arquivo) throws IOException {
        String json = "[\n" + tarefas.stream()
                .map(Tarefa::formatarJson)
                .collect(Collectors.joining(",\n")) + "\n]";

        Files.writeString(arquivo, json);
    }
}