
/*

{

    "nome": "Rita"
  "endereco": {
    "сер": "31270901",
    "city": "Belo Horizonte",
    "neighborhood": "Pampulha",
    "service": "correios",
    "state": "MG",
    "street": "Av. Presidente Antônio Carlos, 6627"
  } - obj

} - obj
 */


public class Pessoa {

    private Endereco endereco;
    private String nome;

    public Pessoa(Endereco endereco, String nome) {
        this.endereco = endereco;
        this.nome = nome;
    }
}
