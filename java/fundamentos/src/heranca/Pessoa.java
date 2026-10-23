package heranca;

public class Pessoa {

    private String nome;
    private String cpf;
    private  int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("----- Dados de " + this.nome + "-----");
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
    }
}
