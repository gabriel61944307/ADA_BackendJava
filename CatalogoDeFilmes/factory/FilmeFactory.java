package CatalogoDeFilmes.factory;

import CatalogoDeFilmes.exception.DiretorException;
import CatalogoDeFilmes.repositorio.DiretorRepositorio;
import CatalogoDeFilmes.repositorio.InterfaceRepositorio;
import CatalogoDeFilmes.modelo.Diretor;
import CatalogoDeFilmes.modelo.Filme;

import java.math.BigDecimal;

public class FilmeFactory {
    public static Filme create(String nome, String dataLancamento, String orcamento, String descricao, String codigoDiretor){
        InterfaceRepositorio diretorRepositorio = new DiretorRepositorio();
        Diretor diretor = (Diretor) diretorRepositorio.buscarPorCodigo(Long.parseLong(codigoDiretor));
        if(diretor != null) {
            return new Filme(nome, Data.StringParaData(dataLancamento), new BigDecimal(orcamento), descricao, diretor);
        }
        throw new DiretorException("Diretor não encontrado na base de dados.");
    }
}
