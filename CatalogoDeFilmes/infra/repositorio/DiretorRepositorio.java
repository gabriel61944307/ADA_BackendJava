package CatalogoDeFilmes.infra.repositorio;

import CatalogoDeFilmes.infra.BD.BancoDeDados;
import CatalogoDeFilmes.modelo.Ator;
import CatalogoDeFilmes.modelo.Diretor;

import java.util.HashMap;
import java.util.Map;

public class DiretorRepositorio implements InterfaceRepositorio{
    static Long proximoCodigo = 0L;
    private HashMap<Long, Diretor> listaDiretores = BancoDeDados.getDiretores();

    @Override
    public boolean gravar(Object objeto) {
        Diretor diretor = (Diretor) objeto;
        listaDiretores.put(proximoCodigo, diretor);
        proximoCodigo++;
        return true;
    }

    @Override
    public boolean atualizar(Long codigo, Object objeto) {
        Diretor diretor = (Diretor) objeto;
        if(listaDiretores.containsKey(codigo)){
            listaDiretores.put(codigo, diretor);
            return true;
        }
        return false;
    }

    @Override
    public boolean excluir(Long codigo) {
        if(listaDiretores.containsKey(codigo)){
            listaDiretores.remove(codigo);
            return true;
        }
        return false;
    }

    @Override
    public Diretor buscarPorCodigo(Long codigo){
        if(listaDiretores.containsKey(codigo)){
            return listaDiretores.get(codigo);
        }
        return null;
    }
    @Override
    public void listarTodos() {
        for(Map.Entry<Long, Diretor> diretor : listaDiretores.entrySet()){
            System.out.println("Código: " + diretor.getKey() + "\n" + diretor.getValue());
        }
    }

    @Override
    public void listarPorId(Long codigo) {
        if(listaDiretores.containsKey(codigo)){
            System.out.println("Código: " + codigo + "\n" + listaDiretores.get(codigo));
        }
    }

}
