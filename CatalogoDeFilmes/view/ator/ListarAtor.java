package CatalogoDeFilmes.view.ator;

import CatalogoDeFilmes.repositorio.AtorRepositorio;
public class ListarAtor {
    private static AtorRepositorio atorRepositorio = new AtorRepositorio();
    public static void execute(){
        try {
            atorRepositorio.listarTodos();
        }
        catch (Exception ex){
            System.out.println("ERRO: " + ex);
            execute();
        }
    }
}
