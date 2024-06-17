import java.util.ArrayList;

public class Loja {
    private String nome;
    private ArrayList<Produto> listaProduto;
    //Lista de clientes
        //lista de pordutos comprados

    public Loja(String nome){
        this.nome = nome;
        this.listaProduto = new ArrayList<>();
    }


    public void addProduto(Produto prod) {
        this.listaProduto.add(prod);
    }

    public void addProduto(String nome,
                           float preco,
                           int quantidade,
                           catProduto categoria){

        this.listaProduto.add(new Produto(nome, preco, quantidade, categoria));
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

    public ArrayList<Produto> getListaProduto() {
        return listaProduto;
    }
}
