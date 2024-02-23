package CatalogoDeFilmes.view.ator;

import CatalogoDeFilmes.factory.AtorFactory;
import CatalogoDeFilmes.infra.repositorio.AtorRepositorio;
import CatalogoDeFilmes.view.ScannerSingleton;

import java.util.Scanner;

public class CadastrarAtor {
    private static AtorRepositorio atorRepositorio = new AtorRepositorio();
    private static Scanner scanner = ScannerSingleton.instance().getScanner();
    public static void execute(){
        System.out.println("Digite o nome do ator:");
        String nome = scanner.nextLine();
        System.out.println("Digite a data de nascimento (dd/mm/aaaa):");
        String dataNasc = scanner.nextLine();
        System.out.println("Digite o pais em que ele nasceu:");
        String pais = scanner.nextLine();
        System.out.println("Digite o estado/provincia/regiao em que ele nasceu:");
        String estadoProvinciaRegiao = scanner.nextLine();
        System.out.println("Digite a cidade/distrito em que ele nasceu:");
        String cidadeDistrito = scanner.nextLine();
        atorRepositorio.gravar(AtorFactory.create(nome, dataNasc, pais, estadoProvinciaRegiao, cidadeDistrito));
    }
}
