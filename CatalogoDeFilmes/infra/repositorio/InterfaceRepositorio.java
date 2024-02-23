package CatalogoDeFilmes.infra.repositorio;

import CatalogoDeFilmes.modelo.Ator;
import CatalogoDeFilmes.modelo.Diretor;

public interface InterfaceRepositorio {
    boolean gravar(Object objeto);
    boolean atualizar(Long codigo, Object objeto);
    boolean excluir(Long codigo);
    Object buscarPorCodigo(Long codigo);
    void listarTodos();
    void listarPorId(Long id);

}
