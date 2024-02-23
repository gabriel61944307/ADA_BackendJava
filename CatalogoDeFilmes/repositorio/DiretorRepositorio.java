package CatalogoDeFilmes.repositorio;

import CatalogoDeFilmes.exception.ModeloException;
import CatalogoDeFilmes.BD.BancoDeDados;
import CatalogoDeFilmes.modelo.Diretor;
import CatalogoDeFilmes.modelo.Filme;

import java.util.*;

public class DiretorRepositorio implements InterfaceRepositorio{
    static Long proximoCodigo = 0L;
    private HashMap<Long, Diretor> listaDiretores = BancoDeDados.getDiretores();
    private HashMap<Long, Filme> listaFilmes = BancoDeDados.getFilmes();

    @Override
    public boolean gravar(Object objeto) {
        Diretor diretor = (Diretor) objeto;
        listaDiretores.put(proximoCodigo, diretor);
        diretor.setCodigo(proximoCodigo);
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
        for(Map.Entry<Long, Filme> filme: listaFilmes.entrySet()){
            Set<Diretor> diretores = filme.getValue().getDiretores();
            for(Diretor diretor : diretores){
                if(Objects.equals(diretor.getCodigo(), codigo)){
                    throw new ModeloException("Não foi possível excluir o diretor pois ele dirige o filme: " + filme.getValue().getNome());
                }
            }
        }
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
