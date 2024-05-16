import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
/*

        System.out.println("Hello world!");


        // ...

        int teste = 10;

        int num3 = 20;

        int soma = teste + num3;

        soma = 2 * (soma + 2);






        // while

        int x = 12;
        int i = 0;

        i++; // inc i = i + 1
        i += 2; // i = i + 2
        i *= 2; // i = i + 2
        i += i; // i = i + i
        i--; // dec i = i - 1

        System.out.println("pre While");

        i = 1;
        while (i < 10){
            System.out.println(i);

            i = i + 1; // i++
        }
        System.out.println("Pos While");

*/
        //do-while





        // for


        /*

         for(0 ; 1; 3 ){
            2

        }
         */
        System.out.println("tab num: ");
        int num = scanner.nextInt();
        /*
        num * 0 = x
        num * 1 = x
        num * 2 = x
        ...
        num * 10 = x
         */
        int k=3;
        for(k = k; k<=10; k++ ){

            int x = num * k;
            System.out.println(num + " x " + k+ " = " + x);

        }
        System.out.println(k);

        System.out.println("----");





        System.out.println("tab num: ");
        int num4 = scanner.nextInt();
        /*
        num * 0 = x
        num * 1 = x
        num * 2 = x
        ...
        num * 10 = x
         */

        for(int j=0; j<=10; j++ ){

            int x = num4 * j;
            System.out.println(num4 + " x " + j + " = " + x);

        }
        // System.out.println(j); // o j nao existe
        System.out.println("----");

        System.out.println("tab num: ");
        int num2 = scanner.nextInt();
        int j=0;
        while(j<=10){
            int x = num2 * j;
            System.out.println(num2 + " x " + j + " = " + x);
            j++;
        }
        System.out.println(j); // j == 11


/*
        int ii = 10;
        System.out.println("inicio "+ ii);
        if (true){
            System.out.println("inicio if "+ ii);
            ii = 30;
            System.out.println("ii Alterado no if "+ ii);
            int foo = 10;
            System.out.println("fim foo if "+ foo);
            System.out.println("fim ii if  "+ ii);
        }

        System.out.println("fim "+ ii);

*/

        System.out.println("----do-while-----");

        //do-while

        /*
           while (1º){
            2º
        }

         */
        int x = 10;
        while (x > 10){
            System.out.println(x);
        }

        /*
         do{
           1º
        }while(2º);

         */

        do{
            System.out.println(x);
        }while(x > 10);





        System.out.println(x);
        while (x > 10){
            x ++;
            System.out.println(x);
        }

    }
}


/*
int i = 10;

if(){
// i -> 10
i = 40
int i = 14;



i -> 14
}

// i -> 40


 */