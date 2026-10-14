package modelos;

public class Aluno {

    // Declarar os atributos (ou propriedades)
    public String nome;
    public int idade;
    public String cpf;
    public String matricula;
    public boolean status;

    // Declarar os Construtores

    // Construtor vazio (sem parâmetros)
    public Aluno () {
        //Declaramos por boas práticas
    }

    public Aluno (String nome) {
        this.nome = nome;
    }

}

