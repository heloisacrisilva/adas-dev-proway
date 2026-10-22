import relacionamento.Categoria;
import modelos.Produto;

public class ProdutoMain {
    public static void main(String[] args) {

        //Instanciando objetos da classe Categoria
        Categoria categoria1 = new Categoria(1, "Comida", true);
        Categoria categoria2 = new Categoria(2, "Bebida", true);
        Categoria categoria3 = new Categoria(3, "Sobremesa", true);

        //Instanciando objetos da classe Produto
        Produto produto1 = new Produto(101, categoria1, 15, 39.90, "Hamburger");
        Produto produto2 = new Produto(102, categoria2, 50, 9.90, "Coca Cola Zero");
        Produto produto3 = new Produto(103, categoria3, 10, 25.90, "Cookie Chocolate");

        produto1.exibirSDados();
        produto1.getCategoria().mudarStatus(false);
        produto1.getCategoria().exibirSDados();
        produto3.trocarCategoria(categoria3);



    }
}
