package CatalogoDeFilmes.view.filme;

import CatalogoDeFilmes.infra.repositorio.DiretorRepositorio;
import CatalogoDeFilmes.infra.repositorio.FilmeRepositorio;

public class ListarFilme {
    private static FilmeRepositorio filmeRepositorio = new FilmeRepositorio();

    public static void execute(){
        filmeRepositorio.listarTodos();
    }
}
