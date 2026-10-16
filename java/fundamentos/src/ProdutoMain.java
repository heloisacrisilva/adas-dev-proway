import modelos.Produto;

public class ProdutoMain {
    public static void main(String[] args) {
        Produto produto1 = new Produto("PW-001", "Macbook Pro M1", 10500);

        //Forma correta de pegar valor da propriedade
        System.out.println("Nome do produto: " + produto1.getNome());

        //Forma correta de enviar valor da propriedade
        produto1.setNome("PC Gamer Pichau");
        System.out.println("Nome do produto: " + produto1.getNome());
    }
}
