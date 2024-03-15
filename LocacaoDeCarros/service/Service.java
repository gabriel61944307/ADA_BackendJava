package service;

import java.util.Collection;

public interface Service<T> {
    void salvar(T objeto);
    Collection<T> buscarTodos();
    T buscar(String identificador);
    void remover(String identificador);
    void alterar(String identificador, T objeto);
}
