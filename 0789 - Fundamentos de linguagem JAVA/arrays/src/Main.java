import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] notas = {10,17,9,8};

        System.out.println(notas[2]);

        notas[2] = 19;

        System.out.println(notas[2]);

        System.out.println(notas.length);

        int[] notas2 = new int[5]; // {0,0,0,0,0}  em C -> int notas2[5];

        System.out.println(notas2[1]);

        notas2[1] = 10;
        notas2[3] = 12;

        System.out.println(notas2[1]);
        System.out.println(notas2.length);

        System.out.println("---------------------------");

        int notasL = 0;


        //precorre o array todo
      for(int i = 0; i < notas2.length; i++){


          // conta os valores diferentes de 0
          if (notas2[i] != 0){
              notasL += 1;
          }

      }
        System.out.println("Estõa lançadas "+ notasL + " notas\n" );

        System.out.println("---------------------------");
      // forEach

        notas2[2] = 20;
        System.out.println("---------------------------");
        System.out.println("---------------------------");

        int[] notas3 = {17,27,35,48};

        for (int i: notas3){
            System.out.println(i);
        }

        System.out.println("---------------------------");
        System.out.println("---------------------------");

        //o i vai rep todos os elemetos da lista um a um
        for(int i: notas2){  // forEach
            // conta os valores diferentes de 0

            if (i != 0){ // != <- não igual <- diferente <- ! <- negação

                notasL += 1; // notasL = notasL + 1
            }
            if (i == 20){
                System.out.println("o aluno teve um 20 ");

                break; // sai do loop
            }
        }
        System.out.println("Estõa lançadas "+ notasL + " notas\n" );


        int[] notas5 = {10,17,9,8};

        double mediaNotas = calcMedia(notas5);

        System.out.println("a media e de: " + mediaNotas);


        int[] notas6 = {10,17,19,18};
        double mediaNotas2 = calcMedia(notas6);

        System.out.println("a media e de: " + mediaNotas2);
    }


    public static double calcMedia(int[] notas){
        double total = 0;

        for (int i: notas){
            total += i;
        }

        double media = total/notas.length;

        return media;

    }

}