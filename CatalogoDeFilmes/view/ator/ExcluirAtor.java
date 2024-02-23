package CatalogoDeFilmes.view.ator;

import CatalogoDeFilmes.infra.repositorio.AtorRepositorio;
import CatalogoDeFilmes.view.ScannerSingleton;

import java.util.Scanner;

public class ExcluirAtor {
    private static AtorRepositorio atorRepositorio = new AtorRepositorio();
    private static Scanner scanner = ScannerSingleton.instance().getScanner();
    public static void execute(){
        System.out.println("Digite o codigo do ator:");
        Long codigo = Long.parseLong(scanner.nextLine());
        atorRepositorio.excluir(codigo);
    }
}
