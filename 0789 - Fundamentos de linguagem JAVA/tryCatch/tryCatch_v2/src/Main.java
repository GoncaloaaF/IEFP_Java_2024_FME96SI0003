public class Main {
    public static void main(String[] args) {


        Aula al = new Aula();




        try {

               al.testeErros(2);

            System.out.println("correu tudo bem");

        }catch (ArithmeticException e){
            System.out.println("ArithmeticException - Algo correu mal....");
            System.out.println(e.getMessage());

        } catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException - Algo correu mal....");
            System.out.println(e.getMessage());
        }catch (oMeuErro e){

             System.out.println("oMeuErro - Algo correu mal....");
            System.out.println(e.getMessage());
        }



    }
}