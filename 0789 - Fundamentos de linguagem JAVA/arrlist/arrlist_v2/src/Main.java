import java.util.ArrayList;

// " kiss philosophy "
public class Main {
    public static void main(String[] args) {
        /*
      Pessoa p = new Pessoa("Nome 1", 20);
      System.out.println(p);
*/
        System.out.println("------------------");
        System.out.println("ArrayList<Pessoa> listaPessoas = new ArrayList<>();");
        System.out.println("------------------");
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        listaPessoas.add(new Pessoa("Nome 1", 20));
        listaPessoas.add(new Pessoa("Nome 2", 21));
        listaPessoas.add(new Pessoa("Nome 3", 21));


        System.out.println(listaPessoas.get(1));
        System.out.println("------------------");

        Pessoa p1 = listaPessoas.get(1);
        System.out.println(p1);

        p1.setNome("Novo Nome da pesso 2");
        System.out.println(p1);

        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println(listaPessoas.get(1));



        System.out.println("------------------");
        System.out.println("ArrayList<Integer> listaInts = new ArrayList<Integer>();");
        System.out.println("------------------");

        ArrayList<Integer> listaInts = new ArrayList<Integer>();
        listaInts.add(1);
        listaInts.add(2);
        listaInts.add(3);

        System.out.println(listaInts);
        System.out.println("------------------");
        System.out.println("------------------");

        int x = listaInts.get(1);
        x = 301;

        System.out.println(listaInts);

        System.out.println("------------------");
        System.out.println("ArrayList<String> listaStr = new ArrayList<String>();");
        System.out.println("------------------");


        ArrayList<String> listaStr = new ArrayList<String>();
        listaStr.add("1");
        listaStr.add("2");
        listaStr.add("3");

        System.out.println(listaStr);
        System.out.println("------------------");
        System.out.println("------------------");

        String x1 = listaStr.get(1);
        x1 = "301";

        System.out.println(listaStr);






    }
}