package CatalogoDeFilmes.infra.repositorio;

import CatalogoDeFilmes.infra.BD.BancoDeDados;
import CatalogoDeFilmes.modelo.Ator;
import CatalogoDeFilmes.modelo.Diretor;

public class DiretorRepositorio implements InterfaceRepositorio{
    static Long proximoCodigo = 0L;

    @Override
    public void gravar(Object objeto) {
        Diretor diretor = (Diretor) objeto;
        BancoDeDados.getDiretores().put(proximoCodigo, diretor);
        proximoCodigo++;
    }

    @Override
    public void atualizar(Long codigo) {

    }

    @Override
    public boolean excluir(Long codigo) {
        return true;
    }

    @Override
    public void listarTodos() {

    }

    @Override
    public void listarPorId(Long id) {

    }

}
