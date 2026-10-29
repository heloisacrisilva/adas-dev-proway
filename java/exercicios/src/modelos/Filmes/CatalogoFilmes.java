
package modelos.Filmes;

import java.util.ArrayList;
import java.util.List;

public class CatalogoFilmes {

    private List<Filme> filmes = new ArrayList<>();

    public CatalogoFilmes() {
    }

    public CatalogoFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    private void exibirFilme(Filme filme) {
        System.out.println("Código: " + filme.getCodigo());
        System.out.println("Título: " + filme.getTitulo());
        System.out.println("Gênero: " + filme.getGenero());
        System.out.println("Assistido: " + filme.isAssistido());
        System.out.println("-------------------");
    }

    private Filme localizarFilme(int codigo) {
        for (Filme filme : filmes) {
            if (filme.getCodigo() == codigo) {
                return filme;
            }
        }

        return null;
    }

    public void adicionarFilme(int codigo, String titulo, String genero) {
        Filme filme = new Filme(codigo, titulo, genero, false);
        filmes.add(filme);
    }

    public void listarFilmes() {
        for (Filme filme : filmes) {
            exibirFilme(filme);
        }
    }

    public void pesquisarFilmePorCod(int codigo) {
        Filme filme = localizarFilme(codigo);

        if (filme != null) {
            exibirFilme(filme);
        } else {
            System.out.println("Filme não encontrado.");
        }
    }

    public void pesquisarFilmePorTitulo(String titulo) {
        boolean encontrado = false;

        for (Filme filme : filmes) {
            if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                exibirFilme(filme);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Filme não encontrado.");
        }
    }

    public void marcarAssistido(int codigo) {
        Filme filme = localizarFilme(codigo);

        if (filme != null) {
            filme.marcarAssistido();
        } else {
            System.out.println("Filme não encontrado.");
        }
    }

    public void marcarNaoAssistido(int codigo) {
        Filme filme = localizarFilme(codigo);

        if (filme != null) {
            filme.marcarNaoAssistido();
        } else {
            System.out.println("Filme não encontrado.");
        }
    }

    public void listarFilmesAssistidos() {
        for (Filme filme : filmes) {
            if (filme.isAssistido()) {
                exibirFilme(filme);
            }
        }
    }

    public void listarFilmesNaoAssistidos() {
        for (Filme filme : filmes) {
            if (!filme.isAssistido()) {
                exibirFilme(filme);
            }
        }
    }

    public void removerFilme(int codigo) {
        boolean removido = filmes.removeIf(
                filme -> filme.getCodigo() == codigo
        );

        if (!removido) {
            System.out.println("Filme não encontrado.");
        }
    }

    public void editarDados(int codigo, String newTitulo, String newGenero) {
        Filme filme = localizarFilme(codigo);

        if (filme != null) {
            filme.editarDados(newTitulo, newGenero);
        } else {
            System.out.println("Filme não encontrado.");
        }
    }
}
