/*


faça um programa:

1- que peça um numero indeterminado de numero:
    2- Quando for indicado um numero entre 1 e 10 calcular a tabuada desse numero
    3- Quando  for indicado qualquer outro número indicar -> "valor invalido"
    4- Quando o valor inserido não for um número  indicar -> " valor não numérico"
    5- :q para sair


 */


/*

var
if, else if, else
switch
for
while
do while

funções

arrays

"converter" dados (.toInt(), .toDouble() )



 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         int c3 = challenge3_v4();

        System.out.println("foram inseridos: " + c3 + " Numeros");

    }


    /*

    faça uma aplicação que peça números ate ser inserido o num 0

        indique quantos números foram inseridos
     */

    public static int challenge3(){

        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while (scanner.nextInt() != 0){
            count += 1;
        }

        return count;
    }


    public static int challenge3_v2(){

        int count = 0;

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        while (num != 0){
            count += 1;
            num = scanner.nextInt();
        }

        return count;
    }



    public static int challenge3_v3(){

        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while (true){
            int num = scanner.nextInt();

            if (num == 0){
                break;
            }

            count += 1;
        }

        return count;
    }


    public static int challenge3_v4(){

        int count = 0;

        Scanner scanner = new Scanner(System.in);

        int num = 0;
        do{
             num = scanner.nextInt();
            count += 1;

        }while (num != 0);


        return count;
    }



}