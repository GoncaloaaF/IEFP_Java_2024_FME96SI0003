import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String val22 = "12 de junho 1990";


        String[] sep = val22.split(" ");

       for (String s : sep) {

           System.out.println(s);
       }


        /*
        System.out.println(sep[0]);
        System.out.println(sep[1]);
        System.out.println(sep[2]);
        System.out.println(sep[3]);
*/

        String val = "1";

        int val2 = 2;

        int soma = val2 + Integer.parseInt(val); // Integer.parseInt(val); -> comverte val para int
        double soma1 = val2 + Double.parseDouble(val);

        double d1 = (double)val2;

        System.out.println(soma);

    }
}