public class Main {
    public static void main(String[] args) {

        /*
            String - Txt -> "bla bla bla "
            int - num inteiros -> 123
            double / float - numeros decimais -> 212.1223
            char - apenas um character - 'A'
            boolean - T ou F -> true
         */


        /*

            type variableName;
            type variableName = value;

         */

        String nome;
        int ano = 2024;
        float altura = 3.23f; // para crirar uma float e necessario terminar com f
        double altura2 = 12.231;
        char gender = 'M'; // <- char esta sempre entre ' '
        //char gender2 = "M";
        boolean done = true;
        boolean done2 = false;

        nome = "Goncalo";

        System.out.println("Ola Mundo, " + nome + " em " + ano);

        nome = "Novo Nome";
        ano = 2007;

        System.out.println("Ola Mundo, " + nome + " em " + ano);

        System.out.println("True: " + done );


        System.out.println("f: " + altura);
        System.out.println("d: " + altura2);


        /*

        o nome da var tem de começar por letra ou _
        nao pode ter espaços nem char especias (expto o _)

         */

        int idade2;
        int _idade2;

        String teste = "asdsadasd dasda 23 @  = $ 123"; // pode ter qq char expto \

        String nome_user = "Gonçalo";
        String username;
        String nome_utilizador;

        int Idade = 10;
        int idade = 20;

        idade = 405;

        System.out.println("idade: " + idade);
        System.out.println("Idade: " + Idade);



    }
}

