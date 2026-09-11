package programas.tarefa;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class TarefaService {
    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public void verificarTarefa(List<Tarefa> tarefas, Path arquivo) throws IOException {
        tarefas = tarefas.stream()
                .filter(tarefa -> tarefa != null && tarefa.getNome() != null && !tarefa.getNome().isBlank())
                .toList();

        tarefaRepository.salvarTarefa(tarefas, arquivo);
    }
}