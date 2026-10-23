package heranca;

//Herdando da classe Pessoa (mãe)
public class Aluno extends Pessoa {

    private String matricula;


    public Aluno() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
