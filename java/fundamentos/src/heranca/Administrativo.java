package heranca;

public class Administrativo extends Pessoa {

    private  boolean temEstacionamento;

    public Administrativo() {
    }

    public Administrativo(boolean temEstacionamento) {
        this.temEstacionamento = temEstacionamento;
    }

    public boolean isTemEstacionamento() {
        return temEstacionamento;
    }

    public void setTemEstacionamento(boolean temEstacionamento) {
        this.temEstacionamento = temEstacionamento;
    }
}
