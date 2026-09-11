package programas.arquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ArquivoService {
    private final ArquivoRepository arquivoRepository;

    public ArquivoService(ArquivoRepository arquivoRepository) {
        this.arquivoRepository = arquivoRepository;
    }

    public void verificarArquivo(Path arquivo) throws IOException {
        if(Files.notExists(arquivo)) {
            arquivoRepository.criarArquivo(arquivo);
        }
    }
}