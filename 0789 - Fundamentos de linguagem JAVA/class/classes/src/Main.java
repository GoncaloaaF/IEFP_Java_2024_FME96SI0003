public class Main {



    public static void main(String[] args) {

        Carro carro1 = new Carro("Audi",
                                "A4",
                                "Preto",
                                2004);

/*
        Carro carro2 = new Carro("Ferrari",
                "F40",
                "Vermelho",
                2004);


        carro1.showInfos();

        carro1.cor = "Amarelo";

        carro1.showInfos();

        carro2.showInfos();

*/

        System.out.println(carro1.getCor()); // vou ler a cor
        carro1.setCor("Lilas");             // vou mudar a cor
        System.out.println(carro1.getCor());// vou ler a cor
        System.out.println("---------");
        System.out.println(carro1.getEstado());
        carro1.arrancar();
        System.out.println(carro1.getEstado());

        carro1.parar();

        System.out.println(carro1.getEstado());

        int i = carro1.getIdade();
        System.out.println(i);


    }

}