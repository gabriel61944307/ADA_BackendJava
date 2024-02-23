package CatalogoDeFilmes.view.diretor;

import CatalogoDeFilmes.factory.DiretorFactory;
import CatalogoDeFilmes.repositorio.DiretorRepositorio;
import CatalogoDeFilmes.view.ScannerSingleton;

import java.util.Scanner;

public class CadastrarDiretor {
    private static DiretorRepositorio diretorRepositorio = new DiretorRepositorio();
    private static Scanner scanner = ScannerSingleton.instance().getScanner();
    public static void execute(){
        try{
            System.out.println("Digite o nome do diretor:");
            String nome = scanner.nextLine();
            System.out.println("Digite a data de nascimento (dd/mm/aaaa):");
            String dataNasc = scanner.nextLine();
            System.out.println("Digite o pais em que ele nasceu:");
            String pais = scanner.nextLine();
            System.out.println("Digite o estado/provincia/regiao em que ele nasceu:");
            String estadoProvinciaRegiao = scanner.nextLine();
            System.out.println("Digite a cidade/distrito em que ele nasceu:");
            String cidadeDistrito = scanner.nextLine();

            diretorRepositorio.gravar(DiretorFactory.create(nome, dataNasc, pais, estadoProvinciaRegiao, cidadeDistrito));
        }
        catch (Exception ex){
            System.out.println("ERRO: " + ex);
            execute();
        }
    }
}
