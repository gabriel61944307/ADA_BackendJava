package CatalogoDeFilmes.infra.repositorio;

import CatalogoDeFilmes.infra.BD.BancoDeDados;
import CatalogoDeFilmes.modelo.Filme;

public class FilmeRepositorio implements InterfaceRepositorio{
    static Long proximoCodigo = 0L;
    @Override
    public void gravar(Object objeto) {
        Filme filme = (Filme) objeto;
        BancoDeDados.getFilmes().put(proximoCodigo, filme);
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
