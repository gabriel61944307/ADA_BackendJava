package CatalogoDeFilmes;

import CatalogoDeFilmes.factory.AtorFactory;
import CatalogoDeFilmes.factory.DiretorFactory;
import CatalogoDeFilmes.factory.FilmeFactory;
import CatalogoDeFilmes.infra.repositorio.AtorRepositorio;
import CatalogoDeFilmes.infra.repositorio.DiretorRepositorio;
import CatalogoDeFilmes.infra.repositorio.FilmeRepositorio;
import CatalogoDeFilmes.infra.repositorio.InterfaceRepositorio;
import CatalogoDeFilmes.modelo.Ator;
import CatalogoDeFilmes.modelo.Diretor;
import CatalogoDeFilmes.modelo.Filme;
import CatalogoDeFilmes.view.MenuPrincipal;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.execute();

//        Ator ator1 = AtorFactory.create("GABRIEL", "13/07/2000", "Brasil", "São Paulo", "Salto");
//        Ator ator2 = AtorFactory.create("JOANINHA", "15/02/1983", "Brasil", "São Paulo", "São Carlos");
//
//        Diretor diretor1 = DiretorFactory.create("ERIVELTON", "05/08/2021", "Brasil", "São Paulo", "Tiete");
//        Diretor diretor2 = DiretorFactory.create("LUCAS", "02/03/1985", "Brasil", "Amapá", "Macapa");
//
//        //Teste atores
//        InterfaceRepositorio atorRepositorio = new AtorRepositorio();
////
//        atorRepositorio.gravar(ator1);
//        atorRepositorio.gravar(ator2);
////        atorRepositorio.listarPorId(0L);
////        atorRepositorio.atualizar(0L, ator2);
////        atorRepositorio.listarTodos();
//
//        //Teste diretores
//        InterfaceRepositorio diretorRepositorio = new DiretorRepositorio();
////
//        diretorRepositorio.gravar(diretor1);
//        diretorRepositorio.gravar(diretor2);
////        diretorRepositorio.listarTodos();
////        diretorRepositorio.atualizar(0L, diretor2);
////        diretorRepositorio.listarPorId(0L);
//
//        //Teste filmes
//        FilmeRepositorio filmeRepositorio = new FilmeRepositorio();
//
//        Filme filme1 = FilmeFactory.create("Mar de monstros", "10/10/2010", "150000000.8", "Filme muito bom.", 1L);
//        Filme filme2 = FilmeFactory.create("Frankenstein", "05/12/1972", "5000000", "Filme muito bom.", 0L);
//
//        filmeRepositorio.gravar(filme1);
//        filmeRepositorio.gravar(filme2);
//        filmeRepositorio.listarTodos();
//        //filmeRepositorio.atualizar(0L, ator1);
//        filmeRepositorio.adicionarAtor(0L, 1L);
//        filmeRepositorio.adicionarAtor(0L, 0L);
//        filmeRepositorio.listarPorId(0L);
    }
}
