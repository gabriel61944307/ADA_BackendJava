package CatalogoDeFilmes.BD;

import CatalogoDeFilmes.modelo.Ator;
import CatalogoDeFilmes.modelo.Diretor;
import CatalogoDeFilmes.modelo.Filme;

import java.util.HashMap;

public class BancoDeDados {
    private static final HashMap<Long, Ator> atores = new HashMap<>();
    private static final HashMap<Long, Diretor> diretores = new HashMap<>();
    private static final HashMap<Long, Filme> filmes = new HashMap<>();

    public static HashMap<Long, Ator> getAtores() {
        return atores;
    }

    public static HashMap<Long, Diretor> getDiretores() {
        return diretores;
    }

    public static HashMap<Long, Filme> getFilmes() {
        return filmes;
    }
}
