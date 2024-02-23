package CatalogoDeFilmes.view.filme;

import CatalogoDeFilmes.infra.repositorio.DiretorRepositorio;
import CatalogoDeFilmes.infra.repositorio.FilmeRepositorio;
import CatalogoDeFilmes.modelo.Filme;
import CatalogoDeFilmes.view.ScannerSingleton;

import java.util.Scanner;

public class ExcluirFilme {
    private static FilmeRepositorio filmeRepositorio = new FilmeRepositorio();
    private static Scanner scanner = ScannerSingleton.instance().getScanner();

    public static void execute(){
        System.out.println("Digite o codigo do filme:");
        Long codigo = Long.parseLong(scanner.nextLine());
        filmeRepositorio.excluir(codigo);
    }

}