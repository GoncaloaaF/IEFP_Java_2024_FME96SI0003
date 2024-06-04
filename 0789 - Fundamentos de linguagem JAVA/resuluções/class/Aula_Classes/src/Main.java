

public class Main {
    public static void main(String[] args) {

        Bola b1 = new Bola("Rosa", 31, "Plastio");

        Bola b2= new Bola("Amarelo", 2, "Ferro");


        b1.mostraCor();
        b1.trocaCor("Verde");
        b1.mostraCor();
        System.out.println("------");
        String txt = b1.getCorMsg();

        System.out.println("Msg b1: " + txt);

    }
}