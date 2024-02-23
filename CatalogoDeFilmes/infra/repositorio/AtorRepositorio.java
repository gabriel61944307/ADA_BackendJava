package CatalogoDeFilmes.infra.repositorio;

import CatalogoDeFilmes.exception.ModeloException;
import CatalogoDeFilmes.infra.BD.BancoDeDados;
import CatalogoDeFilmes.modelo.Ator;
import CatalogoDeFilmes.modelo.Filme;

import java.util.*;

public class AtorRepositorio implements InterfaceRepositorio{
    static Long proximoCodigo = 0L;
    private HashMap<Long, Ator> listaAtores = BancoDeDados.getAtores();
    private HashMap<Long, Filme> listaFilmes = BancoDeDados.getFilmes();

    @Override
    public boolean gravar(Object objeto) {
        Ator ator = (Ator) objeto;
        listaAtores.put(proximoCodigo, ator);
        ator.setCodigo(proximoCodigo);
        proximoCodigo++;
        return true;
    }

    @Override
    public boolean atualizar(Long codigo, Object objeto) {
        Ator ator = (Ator) objeto;
        if(listaAtores.containsKey(codigo)){
            listaAtores.put(codigo, ator);
            return true;
        }
        return false;
    }

    @Override
    public boolean excluir(Long codigo) {
        for(Map.Entry<Long, Filme> filme: listaFilmes.entrySet()){
            Set<Ator> atores = filme.getValue().getAtores();
            for(Ator ator : atores){
                if(Objects.equals(ator.getCodigo(), codigo)){
                    throw new ModeloException("Não foi possível excluir o ator pois ele faz parte do cast do filme: " + filme.getValue().getNome());
                }
            }
        }
        if(listaAtores.containsKey(codigo)){
            listaAtores.remove(codigo);
            return true;
        }
        return false;
    }

    @Override
    public Ator buscarPorCodigo(Long codigo){
        if(listaAtores.containsKey(codigo)){
            return listaAtores.get(codigo);
        }
        return null;
    }
    @Override
    public void listarTodos() {
        for(Map.Entry<Long, Ator> ator : listaAtores.entrySet()){
            System.out.println("Código: " + ator.getKey() + "\n" + ator.getValue());
        }
    }

    @Override
    public void listarPorId(Long codigo) {
        if(listaAtores.containsKey(codigo)){
            System.out.println("Código: " + codigo + "\n" + listaAtores.get(codigo));
        }
    }
}
