import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n1 = 10;
        int n2 = 9;
        int n3 = 7;


        // se n1 > n2 ou n3 > n1

        /*

         || - or    tem de ter um bool a esq e a dir
         && - and   tem de ter um bool a esq e a dir

         */
        System.out.println((n1 < n2));
        System.out.println((n1 > n3));

        if ((n1 < n2) || (n1 > n3)){
            System.out.println("ok");
        }else {
            System.out.println("no");
        }


        System.out.println("---------");
        n1 = 10;
        n2 = 120;
        n3 = 9;

        System.out.println((n1 < n2));
        System.out.println((n1 > n3));

        if (!(!(n1 < n2) && (n1 > n3))){
            System.out.println("ok");
        }else {
            System.out.println("no");
        }


    }
}