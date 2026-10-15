import modelos.Aluno;

public class AlunoMain {

    public static void main(String[] args) {

        // Declarar um objeto do tipo da classe Aluno, com construtor Vazio
        Aluno aluno1 = new Aluno();
        aluno1.exibirDados();


        // Declarar um objeto do tipo da classe Aluno, com construtor com Parâmetros
        Aluno aluno2 = new Aluno("Harry");
        aluno2.exibirDados();


        Aluno aluno3 = new Aluno("Hermione", 18);
        aluno3.exibirDados();

    }

}