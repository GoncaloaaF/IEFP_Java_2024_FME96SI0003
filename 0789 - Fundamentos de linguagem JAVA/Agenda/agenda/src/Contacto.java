import java.util.Objects;
import java.util.UUID;

public class Contacto {

    private UUID uuid;
    private String nome;
    private int telefone;

    public Contacto(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.uuid = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nome='" + nome + '\'' +
                ", telefone=" + telefone +
                '}';
    }

    // getter setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
