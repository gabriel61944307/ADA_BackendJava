package CatalogoDeFilmes.view.diretor;

import CatalogoDeFilmes.infra.repositorio.DiretorRepositorio;
import CatalogoDeFilmes.modelo.Diretor;
import CatalogoDeFilmes.view.ScannerSingleton;

import java.util.Scanner;

public class EditarDiretor {
    private static DiretorRepositorio diretorRepositorio = new DiretorRepositorio();
    private static Scanner scanner = ScannerSingleton.instance().getScanner();

    public static void execute() {
        System.out.println("Digite o codigo do diretor:");
        Long codigo = Long.parseLong(scanner.nextLine());
        Diretor diretorASerAtualizado = diretorRepositorio.buscarPorCodigo(codigo);

        System.out.println("Digite um novo nome para o diretor:");
        String novoNome = scanner.nextLine();
        diretorASerAtualizado.setNome(novoNome);
        diretorRepositorio.atualizar(codigo, diretorASerAtualizado);
    }
}
