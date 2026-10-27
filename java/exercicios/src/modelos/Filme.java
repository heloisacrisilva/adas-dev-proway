package modelos;

public class Filme {
    private int codigo;
    private String titulo;
    private String genero;
    private boolean assistido;

    public Filme() {
    }

    public Filme(int codigo, String titulo, String genero, boolean assistido) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.assistido = assistido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isAssistido() {
        return assistido;
    }

    public void setAssistido(boolean assistido) {
        this.assistido = assistido;
    }

    public void cadastrarFilme(int codigoParam, String tituloParam, String generoParam) {
        this.codigo = codigoParam;
        this.titulo = tituloParam;
        this.genero = generoParam;
        this.assistido = false;
    }

}
