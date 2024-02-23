package CatalogoDeFilmes.infra.repositorio;

import CatalogoDeFilmes.infra.BD.BancoDeDados;
import CatalogoDeFilmes.modelo.Ator;
import CatalogoDeFilmes.modelo.Diretor;
import CatalogoDeFilmes.modelo.Filme;

import java.util.HashMap;
import java.util.Map;

public class FilmeRepositorio implements InterfaceRepositorio{
    static Long proximoCodigo = 0L;
    private HashMap<Long, Filme> listaFilmes = BancoDeDados.getFilmes();
    private InterfaceRepositorio atorRepositorio = new AtorRepositorio();
    private InterfaceRepositorio diretorRepositorio = new DiretorRepositorio();

    @Override
    public boolean gravar(Object objeto) {
        Filme filme = (Filme) objeto;
        listaFilmes.put(proximoCodigo, filme);
        proximoCodigo++;
        return true;
    }

    @Override
    public boolean atualizar(Long codigo, Object objeto) {
        Ator ator = (Ator) objeto;
        return adicionarAtor(codigo, ator.getCodigo());
    }

    @Override
    public boolean excluir(Long codigo) {
        if(listaFilmes.containsKey(codigo)){
            listaFilmes.remove(codigo);
            return true;
        }
        return false;
    }

    @Override
    public Filme buscarPorCodigo(Long codigo) {
        if(listaFilmes.containsKey(codigo)){
            return listaFilmes.get(codigo);
        }
        return null;
    }

    @Override
    public void listarTodos() {
        for(Map.Entry<Long, Filme> filme : listaFilmes.entrySet()){
            System.out.println("Código: " + filme.getKey() + "\n" + filme.getValue());
        }
    }

    @Override
    public void listarPorId(Long codigo) {
        if(listaFilmes.containsKey(codigo)){
            System.out.println("Código: " + codigo + "\n" + listaFilmes.get(codigo));
        }
    }

    public boolean adicionarAtor(Long codigoFilme, Long codigoAtor){
        Ator ator = (Ator) atorRepositorio.buscarPorCodigo(codigoAtor);
        if(ator != null && listaFilmes.containsKey(codigoFilme)){
            listaFilmes.get(codigoFilme).addAtor(ator);
            return true;
        }
        return false;
    }

    public boolean adicionarDiretor(Long codigoFilme, Long codigoDiretor){
        Diretor diretor = (Diretor) diretorRepositorio.buscarPorCodigo(codigoDiretor);
        if(diretor != null && listaFilmes.containsKey(codigoFilme)){
            listaFilmes.get(codigoFilme).addDiretor(diretor);
            return true;
        }
        return false;
    }

}
