public class Veleiro implements Veiculo {

    int numVelas;
    float tamanhoVelas;

    public Veleiro(int numVelas, float tamanhoVelas) {
        this.numVelas = numVelas;
        this.tamanhoVelas = tamanhoVelas;
    }


    public void funcVeleiro(){
        System.out.println("Função do veleiro");
    }


    @Override
    public String tipo() {
        return "Barco";
    }

    @Override
    public String marca() {
        return "Beneteau";
    }

    @Override
    public String modelo() {
        return "Flyer 8 SUNdeck";
    }

    @Override
    public String toString() {
        return "Veleiro{" +
                "numVelas=" + numVelas +
                ", tamanhoVelas=" + tamanhoVelas +
                "tipo=" + tipo()  + '\'' +
                ", marca='" + marca() + '\'' +
                ", modelo='" + modelo() + '\'' +
                '}';
    }
}
