package modelos;

public class Produto {

    //Atributos ou Propriedades;
    private String codigo;
    private String nome;
    private double preco;
    private int quantidade;
    private Categoria categoria;

    //Construtor vazio (boa prática)
    public Produto () {

    }

    //Construtor com parâmetros
    public Produto (String codParam, String nomeParam, double valorParam) {
        this.codigo = codParam;
        this.nome = nomeParam;
    }

    //ENCAPSULAMENTO (Métodos de acesso)

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return preco;
    }

    public void setValor(double valor) {
        this.preco = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void exibirSDados() {
        System.out.println(" ");
        System.out.println("--------------------------------");
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Quantidade:" + this.quantidade);
        System.out.println("Categoria: " + this.categoria.getNome());
        System.out.println("--------------------------------");
    }

    public void exibirValorEstoque() {
        double valorEstoque = this.quantidade * this.preco;
        System.out.println("O valor do estoque está em: R$" + valorEstoque);
    }

    public void trocarCategoria(Categoria novaCategoria) {
        this.categoria = novaCategoria;
    }
}






