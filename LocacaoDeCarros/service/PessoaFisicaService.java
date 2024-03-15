package service;

import BancoDeDados.BD;
import dominio.PessoaFisica;

import java.util.Collection;

public class PessoaFisicaService implements Service {
    static private final BD<String, PessoaFisica> bancoPessoasFisicas = new BD<>();
    @Override
    public void salvar(Object cliente) {
        PessoaFisica clienteFisico = (PessoaFisica) cliente;
        bancoPessoasFisicas.salvar(clienteFisico.getCpf(), clienteFisico);
    }

    @Override
    public Collection<PessoaFisica> buscarTodos() {
        return bancoPessoasFisicas.buscarTodos();
    }

    @Override
    public PessoaFisica buscar(String identificador) {
        return bancoPessoasFisicas.buscar(identificador);
    }

    @Override
    public void remover(String identificador) {
        bancoPessoasFisicas.remover(identificador);
    }

    @Override
    public void alterar(String identificador, Object cliente) {
        PessoaFisica clienteFisico = (PessoaFisica) cliente;
        bancoPessoasFisicas.alterar(identificador, clienteFisico);
    }
}
