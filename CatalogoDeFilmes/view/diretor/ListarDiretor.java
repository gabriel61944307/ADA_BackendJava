package CatalogoDeFilmes.view.diretor;

import CatalogoDeFilmes.infra.repositorio.AtorRepositorio;
import CatalogoDeFilmes.infra.repositorio.DiretorRepositorio;

public class ListarDiretor {
    private static DiretorRepositorio diretorRepositorio = new DiretorRepositorio();
    public static void execute(){
        diretorRepositorio.listarTodos();
    }
}
