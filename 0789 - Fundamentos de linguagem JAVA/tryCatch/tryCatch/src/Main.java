public class Main {
    public static void main(String[] args) {

        int[] list  = {1,2,3,4,5};


        try {
             System.out.println(list[4]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Algo correu mal: " + e.getMessage());
        }finally {
            System.out.println("o try catch treminou");
        }





    }
}