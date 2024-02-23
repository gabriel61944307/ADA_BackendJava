package CatalogoDeFilmes.view.diretor;

import CatalogoDeFilmes.repositorio.DiretorRepositorio;
import CatalogoDeFilmes.view.ScannerSingleton;

import java.util.Scanner;

public class ExcluirDiretor {
    private static DiretorRepositorio diretorRepositorio = new DiretorRepositorio();
    private static Scanner scanner = ScannerSingleton.instance().getScanner();

    public static void execute(){
        try {
            System.out.println("Digite o codigo do diretor:");
            Long codigo = Long.parseLong(scanner.nextLine());
            diretorRepositorio.excluir(codigo);
        }
        catch (Exception ex){
            System.out.println("ERRO: " + ex);
            execute();
        }
    }
}
