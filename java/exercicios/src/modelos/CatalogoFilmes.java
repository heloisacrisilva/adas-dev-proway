package modelos;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class CatalogoFilmes {
    private List<Filme> filmes = new ArrayList<>();

    public CatalogoFilmes() {
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public CatalogoFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public void adicionarFilme(int codigo, String titulo, String genero){
        Filme filme = new Filme(codigo, titulo, genero, false);
        filmes.add(filme);
    }

    public void listarFilmes() {
        for (Filme filme : filmes) {
            System.out.println("Código: " + filme.getCodigo());
            System.out.println("Título: " + filme.getTitulo());
            System.out.println("Gênero: " + filme.getGenero());
            System.out.println("Assistido: " + filme.isAssistido());
            System.out.println("-------------------");
        }
    }

    public void pesquisarFilmePorCod(int codigo) {
        for (Filme filme : filmes) {
            if (filme.getCodigo() == codigo) {
                System.out.println("Código: " + filme.getCodigo());
                System.out.println("Título: " + filme.getTitulo());
                System.out.println("Gênero: " + filme.getGenero());
                System.out.println("Assistido: " + filme.isAssistido());
            }
        }
    }

    public void pesquisarFilmePorTitulo(String titulo) {
        for (Filme filme : filmes) {
            if (filme.getTitulo().equals(titulo)) {
                System.out.println("Código: " + filme.getCodigo());
                System.out.println("Título: " + filme.getTitulo());
                System.out.println("Gênero: " + filme.getGenero());
                System.out.println("Assistido: " + filme.isAssistido());
            }
        }
    }

    public void marcarAssistido(int codigo) {
        for (Filme filme : filmes) {
            if (filme.getCodigo() == codigo) {
                filme.setAssistido(true);
            }
        }
    }

    public void marcarNaoAssistido(int codigo) {
        for (Filme filme : filmes) {
            if (filme.getCodigo() == codigo) {
                filme.setAssistido(false);
            }
        }
    }

    public void listarFilmesAssistidos() {
        for (Filme filme : filmes) {
            if (filme.isAssistido()) {
                System.out.println("Código: " + filme.getCodigo());
                System.out.println("Título: " + filme.getTitulo());
                System.out.println("Gênero: " + filme.getGenero());
                System.out.println("Assistido: " + filme.isAssistido());
                System.out.println("-------------------");
            }
        }
    }

    public void listarFilmesNaoAssistidos() {
        for (Filme filme : filmes) {
            if (!filme.isAssistido()) {
                System.out.println("Código: " + filme.getCodigo());
                System.out.println("Título: " + filme.getTitulo());
                System.out.println("Gênero: " + filme.getGenero());
                System.out.println("Assistido: " + filme.isAssistido());
                System.out.println("-------------------");
            }
        }
    }

    public void removerFilme(int codigo) {
        filmes.removeIf(filme -> filme.getCodigo() == codigo);
    }

    public void editarDados(int codigo, String newTitulo, String newGenero) {
        for (Filme filme : filmes) {
            if (filme.getCodigo() == codigo) {
                filme.setTitulo(newTitulo);
                filme.setGenero(newGenero);
            }
        }
    }
}

