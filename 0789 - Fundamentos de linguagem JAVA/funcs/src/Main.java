public class Main {

    static int foo = 0;
    public static void main(String[] args) {

        saudacao();
        saudacao();
        saudacao();
        saudacao();

        System.out.println("---------------");

        saudacao2("Gonçalo");
        saudacao2("Marco");
        saudacao2("Ana");
        saudacao2("Joana");

        System.out.println("---------------");

        String s = saudacao3("Gonçalo");

        System.out.println(s);

        System.out.println("---------------");


        String s2 = saudacao4("Marco", 10);
        System.out.println(s2);

    }

    public static void saudacao(){
        System.out.println("Ola Mundo!");
    }
    public static void saudacao2(String nome){
        System.out.println("Ola " + nome);
    }

    public static String saudacao3(String nome){

        String msg = "Ola " + nome;

        return msg;
    }

    public static String saudacao4(String nome, int idade){

        int anoCurr = 2024;
        int anoNasc = anoCurr - idade;

        String msg = "Ola! ou o " + nome + " e tenho " + idade + " anos";
        msg = msg + " nasci no ano de " + anoNasc;

        return msg;
    }

    public static void incFoo(){
        foo += 1;
    }

}


