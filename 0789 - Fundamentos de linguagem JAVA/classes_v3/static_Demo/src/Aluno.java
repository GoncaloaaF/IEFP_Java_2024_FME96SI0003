public class Aluno extends Pessoa {

    private String turma;

    public Aluno(String nome, int indade) {
        super(nome, indade);

        this.turma = "sem turma";
        super.a = 99;
        super.c = 9912;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "turma='" + turma + '\'' +
                ", nome=" + super.getNome() +
                ", idade=" + super.getIdade() +
                '}';
    }

    public String getNome2(){
        return super.getNome();
    }

    @Override
    public String getNome(){
        return "nome Anuno";
    }


    //overload

    public void func1(int i, String j ){
        System.out.println("i: " + i + ", j: " + j);
    }

    public void func1(double i, String j ){
        System.out.println("i_d: " + i + ", j: " + j);
    }

    public void func1(int i, String j, String j2){
        System.out.println("i: " + i + ", j: " + j + ", j2: " + j2);
    }



    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
