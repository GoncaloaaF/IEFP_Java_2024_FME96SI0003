
/*
Classe Pessoa: Crie uma classe que modele uma pessoa:

Métodos: Envelhercer, engordar, emagrecer, crescer.

Obs: Por padrão, a cada ano que nossa pessoa envelhece,
 sendo a idade dela menor que 21 anos, ela deve crescer 0,5 cm.

 */

public class Pessoa {

    private String nome;
    private int idade;
    private float peso;
    private float altura;


    public Pessoa(float altura, String nome, int idade, float peso) {
        this.altura = altura;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }


    public void envelhercer() {

        this.idade += 1;

        if (this.idade < 21) {
            this.crescer(0.05f);
        }

    }

    public void engordar(float kilos) {
        this.peso += kilos;
        //this.peso = this.peso + kilos
    }

    public void emagrecer(float kilos) {
        this.peso -= kilos;
    }

    private void crescer(float cm) {
        this.altura += cm;
    }





    // geteres
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }


    // seteres
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade Invalida");
            return;
        }
        this.idade = idade;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}
