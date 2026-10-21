package modelos;

public class Livro {

    //Atributos

    private int codigo;
    private String titulo;
    private double preco;
    private int quantidade;
    private boolean disponivel;

    public Livro () {

    }

    public Livro(int codigo, String titulo, double preco, int quantidade, boolean disponivel) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.preco = preco;
        this.quantidade = quantidade;
        this.disponivel = disponivel;

        this.verificarDisponibilidade();
    }

    //GET e SET

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    //Métodos

    public void verificarDisponibilidade () {
        if (this.disponivel) {
            System.out.println("O livro" + this.titulo + " encontra-se disponível.");
        } else {
            System.out.println("O livro" + this.titulo + " está temporariamento indisponível...");
        }
    }

    public void exibirSDados() {
        System.out.println(" ");
        System.out.println("--------------------------------");
        System.out.println("     D A D O S  D O  LIVRO    ");
        System.out.println(" ");
        System.out.println("Código: " + this.codigo);
        System.out.println("Título: " + this.titulo);
        System.out.println("Preço (un): R$" + this.preco);
        System.out.println("Quantidade em estoque: " + this.quantidade);
        System.out.println("--------------------------------");
    }

    public void vender (int quantidade) {
        if ( this.disponivel && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            System.out.println("Venda de " + quantidade + "exemplares realizada com sucesso!");
        } else {
            System.out.println("Não temos a quantidade desejada em estoque...");
        }
    }

    public void comprar (int quantidade) {
        this.quantidade += quantidade;
        System.out.println("Compra de " + quantidade + "exemplares realizada com sucesso!");
    }
}





