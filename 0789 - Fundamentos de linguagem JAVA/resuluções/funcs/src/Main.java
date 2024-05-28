public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ex1_v2(5);
        ex1_v2(2);
        ex1_v2(6);



    }

    /*

    n = 5

    1
    2   2
    3   3   3
    4   4   4   4
    5   5   5   5   5

     */


    public static void ex1_v2 (int n){

        for (int linha = 1; linha <= n; linha++) { // i <- linha

            for(int j = 1; j <= linha; j ++ ){ // <- colunas
                System.out.print(linha + "\t");
            }

            System.out.println(" ");
        }

    }


















    public static void ex1(int n){

        for (int i = 1; i <= n; i++) {

           ex1_2(i);

           System.out.println(" ");
        }
    }

    public static void ex1_2(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.print(n + " ");
        }
    }



}