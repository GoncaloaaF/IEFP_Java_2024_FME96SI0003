


public class Aula {

    public Aula(){}




    void testeErros(int i) throws oMeuErro {

        if (i == 0){
            System.out.println("vai dar um erro - ArithmeticException");
            throw new ArithmeticException("deu um erro - ArithmeticException\"");
        }else if (i == 1){
            System.out.println("vai dar um erro - IndexOutOfBoundsException");
            throw new IndexOutOfBoundsException("msg");
        }else if (i == 2){
            System.out.println("vai dar um erro - Erro presonalizado - oMeuErro");
            throw new oMeuErro("o meu 1 erro");


        }

        System.out.println("não deu erro");
    }

}
