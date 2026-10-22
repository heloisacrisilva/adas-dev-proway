package relacionamento;

public class Categoria {
    private int codigo;
    private  String nome;
    private boolean status;

    //Construtor vazio (boa prática)
    public Categoria () {

    }

    public Categoria(int codigo, String nome, boolean status) {
        this.codigo = codigo;
        this.nome = nome;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void exibirSDados() {
        System.out.println("----- Dados da Categoria -----");
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Status: " + this.status);
        System.out.println("--------------------------------");
    }

    public void mudarStatus(boolean novoStatus) {

        this.status = novoStatus;
        System.out.println("Status de " + this.nome + " alterado com sucesso!");
    }
}
