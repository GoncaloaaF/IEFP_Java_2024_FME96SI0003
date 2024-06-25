import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Veleiro b1 = new Veleiro(2, 13);
        Veleiro b2 = new Veleiro(1, 15);

        Carro c1 = new Carro(3);
        Carro c2 = new Carro(4);


        b1.funcVeleiro();

        Veiculo v1 = new Veleiro(4, 20);
        Veiculo v2 = new Carro(5);

        ArrayList<Veiculo> lista = new ArrayList<>();

        lista.add(v1); // 0 -  Veiculo -> Veleiro
        lista.add(v2); // 0 -  Veiculo -> Carro
        lista.add(b1); // 2 -> Veleiro
        lista.add(b2);
        lista.add(c1); // 4 -> Carro
        lista.add(c2);


        Carro c = (Carro) lista.get(4);

        System.out.println(c.toString());


        for (Veiculo v : lista) {

           if(v instanceof Carro){
               Carro carro = (Carro) v;
               carro.funcCarro();
           }

        }








    }
}