
enum catProduto{
    smartphones,
    televisões,
    PCs,
    eletrodomestico
}


public class Produto {
    private String nome;
    private float preco;
    private int quantidade;
    private catProduto categoria;


    public Produto(String nome, float preco, int quantidade, catProduto categoria) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public catProduto getCategoria() {
        return categoria;
    }
    public void setCategoria(catProduto categoria) {
        this.categoria = categoria;
    }

}
