package CatalogoDeFilmes.infra.repositorio;

import CatalogoDeFilmes.infra.BD.BancoDeDados;
import CatalogoDeFilmes.modelo.Ator;
import CatalogoDeFilmes.modelo.Diretor;

import java.util.HashMap;
import java.util.Map;

public class AtorRepositorio implements InterfaceRepositorio{
    static Long proximoCodigo = 0L;
    private HashMap<Long, Ator> listaAtores = BancoDeDados.getAtores();

    @Override
    public boolean gravar(Object objeto) {
        Ator ator = (Ator) objeto;
        listaAtores.put(proximoCodigo, ator);
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
