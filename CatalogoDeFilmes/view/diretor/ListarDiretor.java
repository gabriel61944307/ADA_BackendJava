package CatalogoDeFilmes.view.diretor;

import CatalogoDeFilmes.infra.repositorio.DiretorRepositorio;

public class ListarDiretor {
    private static DiretorRepositorio diretorRepositorio = new DiretorRepositorio();
    public static void execute(){
        try {
            diretorRepositorio.listarTodos();
        }
        catch (Exception ex){
            System.out.println("ERRO: " + ex);
            execute();
        }
    }
}
