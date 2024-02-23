package CatalogoDeFilmes.view.filme;

import CatalogoDeFilmes.factory.AtorFactory;
import CatalogoDeFilmes.factory.FilmeFactory;
import CatalogoDeFilmes.infra.repositorio.AtorRepositorio;
import CatalogoDeFilmes.infra.repositorio.FilmeRepositorio;
import CatalogoDeFilmes.modelo.Filme;
import CatalogoDeFilmes.view.ScannerSingleton;

import java.util.Scanner;

public class CadastrarFilme {
    private static FilmeRepositorio filmeRepositorio = new FilmeRepositorio();
    private static Scanner scanner = ScannerSingleton.instance().getScanner();
    public static void execute(){
        System.out.println("Digite o nome do filme:");
        String nome = scanner.nextLine();
        System.out.println("Digite a data de lancamento (dd/mm/aaaa):");
        String dataLancamento = scanner.nextLine();
        System.out.println("Digite o orcamento:");
        String orcamento = scanner.nextLine();
        System.out.println("Digite a descricao:");
        String descricao = scanner.nextLine();
        System.out.println("Digite o codigo do diretor:");
        String codigo = scanner.nextLine();
        filmeRepositorio.gravar(FilmeFactory.create(nome, dataLancamento, orcamento, descricao, codigo));
    }
}
