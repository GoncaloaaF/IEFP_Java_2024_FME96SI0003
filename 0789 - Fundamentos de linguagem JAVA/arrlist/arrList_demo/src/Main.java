import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.addFirst("Novo valor");
        list.add(2, "teste");

        System.out.println(list);
        System.out.println(list.get(1));

        System.out.println(list.size());

        System.out.println(list.contains("Novo valor"));
        System.out.println(list.contains("valor fora da lista"));

        System.out.println(list);
        list.remove("A");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        list.set(0, "Novo valor na pos 0");

        System.out.println(list);
    }
}