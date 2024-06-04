/*



 trocaCor (setCor)
 mostraCor (showCor)

 */



public class Bola {
    private String cor;
    private int circunferencia;
    private String material;


    public Bola(String cor,
                int circunferencia,
                String material) {

        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }

    void trocaCor(String novaCor){
        this.cor = novaCor;
    }

    void mostraCor(){
        System.out.println("a cor da bola é: " + this.cor);
    }

    String getCorMsg(){
        String msg = "a cor da bola é: " + this.cor;
        return  msg;
    }

}
