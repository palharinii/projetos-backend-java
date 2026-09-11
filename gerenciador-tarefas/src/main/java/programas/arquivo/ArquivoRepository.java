package programas.arquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ArquivoRepository {
    public void criarArquivo(Path arquivo) throws IOException {
        Files.writeString(arquivo, "");
    }
}