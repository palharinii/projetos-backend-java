package programas.tarefa;

public class Tarefa {
    private final Long id;
    private String nome;
    private String status;

    public Tarefa(Long id, String nome, String status) {
        this.id = id;
        this.nome = nome;
        this.status = status;
    }

    public String formatarJson() {
        return String.format("""
                {
                  "id": %d,
                  "nome": "%s",
                  "status": "%s"
                }""", id, nome, status).indent(2).stripTrailing();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}