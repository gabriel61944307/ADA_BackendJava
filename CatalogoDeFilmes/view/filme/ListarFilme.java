package CatalogoDeFilmes.view.filme;

import CatalogoDeFilmes.repositorio.FilmeRepositorio;

public class ListarFilme {
    private static FilmeRepositorio filmeRepositorio = new FilmeRepositorio();

    public static void execute(){
        try {
            filmeRepositorio.listarTodos();
        }catch (Exception ex){
            System.out.println("ERRO: " + ex);
            execute();
        }

    }
}
