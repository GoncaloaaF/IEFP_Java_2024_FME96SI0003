import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next
        System.out.println("Qual o mes? ");
        int mes = sc.nextInt();

        /*
        if (mes == 1) {
            System.out.println("Janeiro");
        }else if (mes == 2) {
            System.out.println("Fevereiro");
        }else if (mes == 3) {
            System.out.println("Março");
        }else if (mes == 4) {
            System.out.println("Abril");
        }else if (mes == 5) {
            System.out.println("Maio");
        }else {
            System.out.println("Mes Invalido");
        }

         */


        //  { }  <- em java define um bloco



         switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break; //termina um bloco
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            default:
                System.out.println("Mes Invalido");

        }
        System.out.println("final do codigo");
    }
}