package modelos;

public class Produto {

    //Atributos ou Propriedades;
    private String codigo;
    private String nome;
    private double valor;
    private boolean cadastroAtivo;

    //Construtor vazio (boa prática)
    public Produto () {

    }

    //Construtor com parâmetros
    public Produto (String codParam, String nomeParam, double valorParam) {
        this.codigo = codParam;
        this.nome = nomeParam;
        this.valor = valorParam;
        this.cadastroAtivo = true;
    }

    //ENCAPSULAMENTO (Métodos de acesso)

    //GET
    public String getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public double getValor() {
        return this.valor;
    }

    public boolean getCadastroAtivo() {
        return this.cadastroAtivo;
    }

    //SET
    public void setCodigo (String codigo) {
        this.codigo = codigo;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setValor (double valor) {
        this.valor = valor;
    }

    public void setCadastroAtivo (boolean cadastroAtivo) {
        this.cadastroAtivo = cadastroAtivo;
    }

}






