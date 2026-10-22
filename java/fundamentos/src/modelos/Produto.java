package modelos;

import relacionamento.Categoria;

public class Produto {

    //Atributos ou Propriedades;
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;
    private Categoria categoria;

    //Construtor vazio (boa prática)
    public Produto () {

    }

    //Construtor com parâmetros
    public Produto(int codigo, Categoria categoria, int quantidade, double preco, String nome) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.preco = preco;
        this.nome = nome;
    }

    //ENCAPSULAMENTO (Métodos de acesso)

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void exibirSDados() {
        System.out.println("------ Dados do Produto -------");
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
        if (novaCategoria.isStatus()) {
            if (this.categoria.getCodigo() == novaCategoria.getCodigo()) {
                System.out.println("Essa categoria já está atribuída para " + this.nome);
            } else {
                this.categoria = novaCategoria;
                System.out.println("Categoria atuaizada com sucesso!");
            }
        } else {
            System.out.println("Essa categoria não está ativa no momento...");
        }
    }
}






