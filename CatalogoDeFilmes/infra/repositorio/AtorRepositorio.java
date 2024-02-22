package CatalogoDeFilmes.infra.repositorio;

import CatalogoDeFilmes.Main;
import CatalogoDeFilmes.infra.BD.BancoDeDados;
import CatalogoDeFilmes.modelo.Ator;

import java.util.HashMap;
import java.util.Map;

public class AtorRepositorio implements InterfaceRepositorio{
    static Long proximoCodigo = 0L;
    private HashMap<Long, Ator> listaAtores = BancoDeDados.getAtores();

    @Override
    public void gravar(Object objeto) {
        Ator ator = (Ator) objeto;
        listaAtores.put(proximoCodigo, ator);
        proximoCodigo++;
    }

    @Override
    public void atualizar(Long codigo) {

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
    public void listarTodos() {
        for(Map.Entry<Long, Ator> ator : BancoDeDados.getAtores().entrySet()){
            System.out.println("Código: " + ator.getKey() + "\n" + ator.getValue());
        }
    }

    @Override
    public void listarPorId(Long id) {

    }
}
