package programas;

import programas.arquivo.ArquivoRepository;
import programas.arquivo.ArquivoService;
import programas.tarefa.Tarefa;
import programas.tarefa.TarefaRepository;
import programas.tarefa.TarefaService;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ArquivoRepository arquivoRepository = new ArquivoRepository();
        ArquivoService arquivoService = new ArquivoService(arquivoRepository);

        Path arquivo = Path.of("tarefas.json");
        arquivoService.verificarArquivo(arquivo);

        TarefaRepository tarefaRepository = new TarefaRepository();
        TarefaService tarefaService = new TarefaService(tarefaRepository);

        List<Tarefa> tarefas = List.of(
                new Tarefa(1L, "estudar java", "done"),
                new Tarefa(2L, "estudar python", "todo"),
                new Tarefa(3L, "estudar c#", "todo"),
                new Tarefa(4L, "estudar c++", "todo"),
                new Tarefa(5L, "estudar c", "todo")
        );

        tarefaService.verificarTarefa(tarefas, arquivo);
    }
}