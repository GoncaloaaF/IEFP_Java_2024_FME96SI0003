
import java.util.Scanner; // tem de estar aqui, Aussuma que é uma receita


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // tem de estar aqui, Aussuma que é uma receita

        System.out.println("Digite uma idade");
        int numero = scanner.nextInt(); // ler um inteiro

        int idade_adulto = 18;


        /*
            = - atribuição


            -- > devolve sp true ou false
            > - Maior
            < - menor
            ==  - Igual

            >= - maior ou igual
            <= - menot ou igual

            != - não igual (Diferente)



         */
        if (numero >= idade_adulto){

            System.out.println("é um adulto");

        }else{

            System.out.println("nao é um adulto");

        }


        System.out.println("Digite 2 numeros ");
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();

        /*
        scanner.nextLine() <- le uma string
         */
        if (numero2 > numero3){

            System.out.println(numero2 + " > " + numero3);

        } else if (numero2 < numero3) {

            System.out.println(numero2 + " < " + numero3);

        } else{

            System.out.println(numero2 + " = " + numero3);

        }


        System.out.println(!false);

        System.out.println(numero2 > numero3);
        System.out.println(!(numero2 > numero3));

        /*
        numero2 = 1
        numero3 = 10

        System.out.println(!(numero2 > numero3));
              System.out.println(!false);
              System.out.println(true);


         */


        System.out.println((numero2 > numero3) == (numero3 < numero));
        /*
            quando temos 2 valores bool não podem ser aplicadas comparações de > ou <
            uma vez que nao se consegue definir o que e maior
         */




        /*
        !true <- não true | false
         */



    }
}