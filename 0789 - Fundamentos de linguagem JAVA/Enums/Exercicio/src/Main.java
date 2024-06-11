

/*

Você está desenvolvendo um sistema de gestão de stock para uma loja de produtos eletronicos.
O sistema precisa armazenar informações sobre os produtos, incluindo

Leja:
    nome:


Porduto:
    nome,
    preço,
    quantidade em stock
    categoria.

 A loja vende diversos tipos de produtos eletronicos, como
 smartphones,
 televisões,
  PCs,
  eletrodomésticos.

 */


public class Main {



    public static void main(String[] args) {
        Loja myLoja;

        myLoja = new Loja("Loja cool");

        myLoja.addProduto("iPhone", 1200, 10, catProduto.smartphones);
        myLoja.addProduto("Imac", 3000, 10, catProduto.PCs);
        myLoja.addProduto( "hp", 800, 10, catProduto.PCs);



        myLoja.listarPordutos();


        System.out.println("-----------------");
        myLoja.listarPordutos(catProduto.smartphones);
    }




}