package CatalogoDeFilmes;

import CatalogoDeFilmes.infra.repositorio.AtorRepositorio;
import CatalogoDeFilmes.infra.repositorio.InterfaceRepositorio;
import CatalogoDeFilmes.modelo.Ator;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        InterfaceRepositorio AtorRepositorio = new AtorRepositorio();
        AtorRepositorio.gravar(new Ator("GABRIEL", LocalDate.now(), "Brasil", "São Paulo", "Salto"));
        AtorRepositorio.gravar(new Ator("Lucas", LocalDate.now(), "Brasil", "São Paulo", "Salto"));


        AtorRepositorio.listarTodos();
        if (!AtorRepositorio.excluir(5L)) {
            System.out.println("Chave não encontrada.");
        }
        AtorRepositorio.listarTodos();
    }
}
