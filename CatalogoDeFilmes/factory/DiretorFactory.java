package CatalogoDeFilmes.factory;

import CatalogoDeFilmes.modelo.Diretor;
import CatalogoDeFilmes.modelo.LocalNascimento;

public class DiretorFactory {
    public static Diretor create(String nome, String stringDataNascimento, String pais, String estadoProvinciaRegiao, String cidadeDistrito){
        return new Diretor(nome, Data.StringParaData(stringDataNascimento), new LocalNascimento(pais, estadoProvinciaRegiao, cidadeDistrito));
    }

}
