public class Pessoa {

    static int numPessoas = 0;

     private String nome;
     private int idade;

     public int a = 0;
     private int b = 0;
     protected int c = 0;


     public Pessoa(String nome, int idade) {
         this.nome = nome;
         this.idade = idade;
         Pessoa.numPessoas++;
     }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
