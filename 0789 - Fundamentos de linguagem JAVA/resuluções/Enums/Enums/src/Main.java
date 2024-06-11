enum Genero2{
    MASCULINO,
    FEMININO,
    OUTRO
}

enum Avaliacao{
    MUITO_FRACO, // 0  - 30
    FRACO,       // 30 - 49
    MEDIO,       // 50 - 70
    BOM,         // 71 - 90
    MUITO_BOM    // 91 - 100
}


public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("nome", 21, "", Genero.MASCULINO);
        float nota = 50;
        Avaliacao av;

        if(nota < 30){
            av = Avaliacao.MUITO_FRACO;
        } else if (nota < 50) {
            av = Avaliacao.FRACO;
        } else if (nota < 70) {
            av = Avaliacao.MEDIO;
        }else if (nota < 90) {
            av = Avaliacao.BOM;
        }else{
            av = Avaliacao.MUITO_BOM;
        }
        System.out.println(av);


        System.out.println("Hello world!");

        int idade;

        String nome;

        Genero2 myGen;

        myGen = Genero2.OUTRO;

        switch (myGen){
            case MASCULINO:
                System.out.println("MASCULINO");
                break;
            case FEMININO:
                System.out.println("FEMININO");
                break;
            case OUTRO:
                System.out.println("Outro");
                break;
        }


    } // main
    
}