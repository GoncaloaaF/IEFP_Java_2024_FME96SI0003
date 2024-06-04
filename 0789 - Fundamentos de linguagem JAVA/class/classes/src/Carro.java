class Carro {

    String marca;
    String modelo;
    String cor;
    int ano;

    //Construtor - Serve para inicializar obj do tipo carro
    public Carro(String marca,
                 String modelo,
                 String cor,
                 int ano) {

        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;

    }

    public void showInfos() {
        System.out.println("-----------");
        System.out.println("A marca do carro é: " + this.marca);
        System.out.println("O Modelo do carro é: " + this.modelo);
        System.out.println("A Cor do carroo é: " + this.cor);
        System.out.println("O ano do carro é: " + this.ano);
        System.out.println("-----------");
    }
}
