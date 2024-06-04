class Carro {

    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private String estado;

    //Construtor - Serve para inicializar obj do tipo carro
    public Carro(String marca,
                 String modelo,
                 String cor,
                 int ano) {

        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.estado = "Parado";

    }

    public void showInfos() {
        System.out.println("-----------");
        System.out.println("A marca do carro é: " + this.marca);
        System.out.println("O Modelo do carro é: " + this.modelo);
        System.out.println("A Cor do carroo é: " + this.cor);
        System.out.println("O ano do carro é: " + this.ano);
        System.out.println("-----------");
    }


    public void arrancar () {
        System.out.println("O carro arrancou");
        this.estado = "Andar";
    }

    public void parar () {
        System.out.println("O carro parou");
        this.estado = "Parado";
    }

    public int getIdade() {
        return 2023 - this.ano;
    }


    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

