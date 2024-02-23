package CatalogoDeFilmes.factory;

import CatalogoDeFilmes.modelo.Ator;
import CatalogoDeFilmes.modelo.LocalNascimento;

public class AtorFactory {
    public static Ator create(String nome, String stringDataNascimento, String pais, String estadoProvinciaRegiao, String cidadeDistrito){
        return new Ator(nome, Data.StringParaData(stringDataNascimento), new LocalNascimento(pais, estadoProvinciaRegiao, cidadeDistrito));
    }
}