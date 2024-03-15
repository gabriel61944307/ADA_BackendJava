package service;

import BancoDeDados.BD;
import dominio.PessoaJuridica;

import java.util.Collection;

public class PessoaJuridicaService implements Service {
    static private final BD<String, PessoaJuridica> bancoPessoasJuridicas = new BD<>();
    @Override
    public void salvar(Object objeto) {
        PessoaJuridica clienteJuridico = (PessoaJuridica) objeto;
        bancoPessoasJuridicas.salvar(clienteJuridico.getCnpj(), clienteJuridico);
    }

    @Override
    public Collection<PessoaJuridica> buscarTodos() {
        return bancoPessoasJuridicas.buscarTodos();
    }

    @Override
    public PessoaJuridica buscar(String identificador) {
        return bancoPessoasJuridicas.buscar(identificador);
    }

    @Override
    public void remover(String identificador) {
        bancoPessoasJuridicas.remover(identificador);
    }

    @Override
    public void alterar(String identificador, Object objeto) {
        PessoaJuridica clienteJuridico = (PessoaJuridica) objeto;
        bancoPessoasJuridicas.alterar(identificador, clienteJuridico);
    }
}
