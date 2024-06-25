

public class Carro implements Veiculo {

    private int numPortas;

    public Carro(int numPortas) {
        this.numPortas = numPortas;
    }

    public void funcCarro(){
        System.out.println("Função do Carro");
    }


    @Override
    public String tipo() {
        return "Carro";
    }

    @Override
    public String marca() {
        return "BMW";
    }

    @Override
    public String modelo() {
        return "X5";
    }


    @Override
    public String toString() {
        return "Carro{" +
                "numPortas='" + numPortas + '\'' +
                "tipo='" + tipo() + '\'' +
                "marca='" + marca() + '\'' +
                "modelo='" + modelo() + '\'' +
                '}';
    }
}
