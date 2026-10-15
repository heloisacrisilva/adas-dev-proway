package modelos;

public class Aluno {

    // Declarar os atributos (ou propriedades)
    public String nome;
    public int idade;
    public String cpf;
    public String matricula;
    public boolean status;


    // Declarar os Construtores
    public Aluno () {

    }

    public Aluno (String nome) {
        this.nome = nome;
    }

    public Aluno (String nomeParametro, int idadeParametro) {
        this.nome = nomeParametro;
        this.idade = idadeParametro;
    }


    // Declarar métodos específicos da classe
    public void exibirDados () {
        System.out.println("***********************************");
        System.out.println("     D A D O S  D O  A L U N O     ");
        System.out.println("***********************************");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Matricula: " + this.matricula);
    }


}