public class Main {
    public static void main(String[] args) {


        Pessoa p = new Pessoa("nome", 10);

        Pessoa p2 = new Pessoa("nome", 10);

        p.a = 999;
        p.c = 11;
        System.out.println(p.c);

        System.out.println(p);

        System.out.println(Pessoa.numPessoas);

        Pessoa.numPessoas++;

        System.out.println(Pessoa.numPessoas);


        Aluno al = new Aluno("Nome real", 10);

        System.out.println(al);


        System.out.println(al.getNome());
        System.out.println(al.getNome2());


        System.out.println("--------------------");

        al.func1(1,"txt");
        al.func1(1.0,"txt");
        al.func1(1,"txt", "txt2");
    }
}