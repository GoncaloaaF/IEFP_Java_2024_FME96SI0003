public class Loja {
    private String nome;
    private Produto[] listaProduto;

    public Loja(String nome){
        this.nome = nome;
        this.listaProduto = new Produto[3];
    }


    public void addProduto(int pos, Produto prod) {
        this.listaProduto[pos] = prod;
    }

    public void addProduto(int pos,
                           String nome,
                           float preco,
                           int quantidade,
                           catProduto categoria){

        this.listaProduto[pos] = new Produto(nome, preco, quantidade, categoria);
    }


    public void listarPordutos(){

        for (Produto elm:  this.listaProduto){
            System.out.println(elm.getNome());
        }
    }

    public void listarPordutos(catProduto cat){

        for (Produto elm:  this.listaProduto){

            if (elm.getCategoria() == cat){
                System.out.println(elm.getNome());
            }

        }
    }




    public String getNome() {
        return nome;
    }

    public Produto[] getListaProduto() {
        return listaProduto;
    }
}
