public class Main {



    public static void main(String[] args) {

        Carro carro1 = new Carro("Audi",
                                "A4",
                                "Preto",
                                2004);


        Carro carro2 = new Carro("Ferrari",
                "F40",
                "Vermelho",
                2004);


        carro1.showInfos();

        carro1.cor = "Amarelo";

        carro1.showInfos();

        carro2.showInfos();

    }

}