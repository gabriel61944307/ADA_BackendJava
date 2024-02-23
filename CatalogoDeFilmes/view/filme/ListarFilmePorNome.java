package CatalogoDeFilmes.view.filme;

import CatalogoDeFilmes.infra.repositorio.FilmeRepositorio;
import CatalogoDeFilmes.view.ScannerSingleton;

import java.util.Scanner;

public class ListarFilmePorNome {
    private static FilmeRepositorio filmeRepositorio = new FilmeRepositorio();
    private static Scanner scanner = ScannerSingleton.instance().getScanner();

    public static void execute(){
        try {
            System.out.println("Digite o nome ou parte do nome do filme a ser pesquisado:");
            String nome = scanner.nextLine();
            filmeRepositorio.listarPorNome(nome);
        }catch (Exception ex){
            System.out.println("ERRO: " + ex);
            execute();
        }
    }
}
