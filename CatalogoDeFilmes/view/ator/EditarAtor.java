package CatalogoDeFilmes.view.ator;

import CatalogoDeFilmes.exception.ModeloException;
import CatalogoDeFilmes.repositorio.AtorRepositorio;
import CatalogoDeFilmes.modelo.Ator;
import CatalogoDeFilmes.view.ScannerSingleton;

import java.util.Scanner;

public class EditarAtor {
    private static AtorRepositorio atorRepositorio = new AtorRepositorio();
    private static Scanner scanner = ScannerSingleton.instance().getScanner();
    public static void execute(){
        try {
            System.out.println("Digite o codigo do ator:");
            Long codigo = Long.parseLong(scanner.nextLine());
            Ator atorASerAtualizado = atorRepositorio.buscarPorCodigo(codigo);
            if(atorASerAtualizado == null) throw new ModeloException("Ator não encontrado.");

            System.out.println("Digite um novo nome para o ator:");
            String novoNome = scanner.nextLine();
            atorASerAtualizado.setNome(novoNome);

            atorRepositorio.atualizar(codigo, atorASerAtualizado);
        }
        catch (Exception ex){
            System.out.println("ERRO: " + ex);
            execute();
        }
    }
}
