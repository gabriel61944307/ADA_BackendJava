package CatalogoDeFilmes.infra.repositorio;

public interface InterfaceRepositorio {
    void gravar(Object objeto);
    void atualizar(Long codigo);
    boolean excluir(Long codigo);
    void listarTodos();
    void listarPorId(Long id);

}
