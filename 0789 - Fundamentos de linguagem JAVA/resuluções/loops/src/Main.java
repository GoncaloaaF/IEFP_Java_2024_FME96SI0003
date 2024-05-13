import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        /*

        Tendo como dado de entrada a altura (h) de uma pessoa, costrua um nalgoritmo que
        calcule seu peso ideal, utilizando as seguintes fórmulas:
            Para homens: (72.7*h) - 58
            Para mulheres: (62.1*h) - 44.7

         */

        /*

            entrada -> altura


            como?

            ideal_homem = (72.7 * altura) - 58
            ideal_Mulher = (62.1 * altura) - 44.7

            saida -> Peso ideal_homem
                     Peso ideal_Mulher



         */
/*
        System.out.print("Qual a Altura: ");
        double altura = scanner.nextDouble();
        double ideal_homem = (72.7 * altura) - 58;
        double ideal_mulher = (62.1 * altura) - 44.7;


        System.out.println("peso ideal:\nHomem:\t"+ ideal_homem+"Kg\nMulher:\t"+ ideal_mulher+"Kg");

*/




        /*

            Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
            Calcule e mostre o total do seu salário no referido mês, sabendo-se que

             são descontados
             11% para o Imposto de Renda
             8% para o INSS
             5% para o sindicato,

              faça um programa que nos dê:

            a) salário bruto.
            b) quanto pagou ao INSS.
            c) quanto pagou ao sindicato.
            d) o salário líquido.
            e) calcule os descontos e o salário líquido, conforme a tabela abaixo:
                + Salário Bruto : R$
                - IR (11%) : R$
                - INSS (8%) : R$
                - Sindicato ( 5%) : R$
                = Salário Liquido : R$
                Obs.: Salário Bruto - Descontos = Salário Líquido.

         */

        /*
        double IR = 0.11;
        double INSS = 0.08;
        double sindicado = 0.05;


        System.out.print("total de hora: ");
        double num_horas = scanner.nextInt();

        System.out.print("Valor hora: ");
        double valor_hora = scanner.nextDouble();

        double salario_bruto = num_horas * valor_hora;
        double valor_IR = salario_bruto * IR;
        double valor_INSS = salario_bruto * INSS;
        double valor_sindicado = salario_bruto * sindicado;

        double salario_liquido = salario_bruto - valor_IR - valor_INSS - valor_sindicado;


        String resposta = "+ Salário Bruto:" + salario_bruto +" €\n" +
                "- IR (11%):" + valor_IR +" €\n" +
                "- INSS (8%):" + valor_INSS +" €\n" +
                "- Sindicato (5%):" + valor_sindicado + " €\n" +
                "= Salário Liquido:" + salario_liquido + "€";

        System.out.println(resposta);

        */



        /*

        Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são

        - Imposto de Renda, que depende do salário bruto (conforme tabela abaixo)
        - 3% para o Sindicato
        - FGTS corresponde a 11% do Salário Bruo  mas não é descontado (é a empresa que deposita).



            IR
            salario_bruto2 < 900 <- 0%
            salario_bruto2 <= 1500 <- 5%
            salario_bruto2 <= 2500 <- 10%
            salario_bruto2 > 2500  <- 20%




         Imprima na tela as informações,
         dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade
         de hora é 220.


        Salário Bruto: (5 * 220)        : R$ 1100,00
        (-) IR (5%)                     : R$   55,00
        (-) INSS ( 10%)                 : R$  110,00
        FGTS (11%)                      : R$  121,00
        Total de descontos              : R$  165,00
        Total de encragos               : R$ 1221,00
        Salário Liquido                 : R$  935,00




         */



        System.out.print("total de hora: ");
        double num_horas2 = scanner.nextInt();

        System.out.print("Valor hora: ");
        double valor_hora2 = scanner.nextDouble();
        double salario_bruto2 = num_horas2 * valor_hora2;

        /*
              IR
            salario_bruto2 < 900 <- 0%
            salario_bruto2 <= 1500 <- 5%
            salario_bruto2 <= 2500 <- 10%
            salario_bruto2 > 2500  <- 20%

         */

        double IR2;
        double INSS2 = 0.1;
        double sindicado2 = 0.03;
        double FGTS = 0.11;

        if (salario_bruto2 < 900){
            IR2 = 0.0;
        }else if (salario_bruto2 <= 1500){
            IR2 = 0.05;
        }else if (salario_bruto2 <= 2500) {
            IR2 = 0.1;
        }else{
            IR2 = 0.2;
        }

        double valor_IR2 = salario_bruto2 * IR2;
        double valor_INSS2 = salario_bruto2 * INSS2;
        double valor_sindicado2 = salario_bruto2 * sindicado2;
        double valor_FGTS = salario_bruto2 * FGTS;
        double total_encargos = salario_bruto2 + valor_FGTS;


        double descontos = valor_IR2 + valor_INSS2 + valor_sindicado2;
        double salario_liquido2 = salario_bruto2 - descontos;



        String msg2 =   "Salário Bruto: (5 * 220)        : R$\t"+ salario_bruto2 +"\n" +
                        "(-) IR (5%)                     : R$\t"+ valor_IR2 +"\n" +
                        "(-) INSS (10%)                  : R$\t"+ valor_INSS2 +"\n" +
                        "(-) Sindicato (3%)              : R$\t"+ valor_sindicado2 +"\n" +
                        "FGTS (11%)                      : R$\t"+ valor_FGTS +"\n" +
                        "Total de descontos              : R$\t"+ descontos +"\n" +
                        "Total de encragos               : R$\t"+ total_encargos +"\n" +
                        "Salário Liquido                 : R$\t"+salario_liquido2;

        System.out.println(msg2);

        


    }
}