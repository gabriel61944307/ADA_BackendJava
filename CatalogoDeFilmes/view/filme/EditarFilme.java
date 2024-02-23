package CatalogoDeFilmes.view.filme;

import CatalogoDeFilmes.infra.repositorio.AtorRepositorio;
import CatalogoDeFilmes.infra.repositorio.DiretorRepositorio;
import CatalogoDeFilmes.infra.repositorio.FilmeRepositorio;
import CatalogoDeFilmes.modelo.Ator;
import CatalogoDeFilmes.modelo.Diretor;
import CatalogoDeFilmes.modelo.Filme;
import CatalogoDeFilmes.view.ScannerSingleton;

import java.util.Scanner;

public class EditarFilme {
    private static FilmeRepositorio filmeRepositorio = new FilmeRepositorio();
    private static DiretorRepositorio diretorRepositorio = new DiretorRepositorio();
    private static AtorRepositorio atorRepositorio = new AtorRepositorio();
    private static Scanner scanner = ScannerSingleton.instance().getScanner();

    public static void execute() {
        System.out.println("Digite o codigo do filme:");
        Long codigo = Long.parseLong(scanner.nextLine());
        Filme filmeASerAtualizado = filmeRepositorio.buscarPorCodigo(codigo);

        System.out.println("Digite uma nova informação para o que desejar alterar ou aperte enter para não alterar.");

        System.out.println("Digite uma nova descricao:");
        String novaDescricao = scanner.nextLine();

        if(novaDescricao != ""){
            filmeASerAtualizado.setDescricao(novaDescricao);
        }

        String codigoDiretor = "";
        do{
            System.out.println("Digite o código de um novo diretor:");
            codigoDiretor = scanner.nextLine();
            if(codigoDiretor != "") {
                filmeASerAtualizado.addDiretor(diretorRepositorio.buscarPorCodigo(Long.parseLong(codigoDiretor)));
            }
        } while (codigoDiretor != "");

        String codigoAtor = "";

        do{
            System.out.println("Digite o código de um novo ator:");
            codigoAtor = scanner.nextLine();
            if(codigoAtor != "") {
                filmeASerAtualizado.addAtor(atorRepositorio.buscarPorCodigo(Long.parseLong(codigoAtor)));
            }
        }while (codigoAtor != "");

        filmeRepositorio.atualizar(codigo, filmeASerAtualizado);
    }
}
