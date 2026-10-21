import modelos.Categoria;
import modelos.Produto;

public class ProdutoMain {
    public static void main(String[] args) {
        Produto produto1 = new Produto("PW-001", "Macbook Pro M1", 10500);

        //Forma correta de pegar valor da propriedade
//        System.out.println("Nome do produto: " + produto1.getNome());

        Categoria categoria1 = new Categoria(123, "Beleza", true);
        //Forma correta de enviar valor da propriedade
        produto1.setCategoria(categoria1);
        produto1.exibirSDados();

        Categoria categoria2 = new Categoria(123, "Eletrônico", true);
        produto1.trocarCategoria(categoria2);
        produto1.exibirSDados();
    }
}
