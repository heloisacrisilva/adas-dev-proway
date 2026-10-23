package heranca;

public class Professor extends Pessoa {
    private String codigoEspecial;
    private String materia;

    public Professor() {
    }

    public Professor(String materia, String codigoEspecial) {
        this.materia = materia;
        this.codigoEspecial = codigoEspecial;
    }

    public String getCodigoEspecial() {
        return codigoEspecial;
    }

    public void setCodigoEspecial(String codigoEspecial) {
        this.codigoEspecial = codigoEspecial;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
