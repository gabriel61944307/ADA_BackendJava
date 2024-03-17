package service;

import BancoDeDados.BD;
import dominio.PessoaJuridica;

import java.util.Collection;

public class PessoaJuridicaService implements Service<PessoaJuridica> {
    static private final BD<String, PessoaJuridica> bancoPessoasJuridicas = new BD<>();

    @Override
    public void salvar(PessoaJuridica objeto) {
        bancoPessoasJuridicas.salvar(objeto.getCnpj(), objeto);
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
    public void alterar(String identificador, PessoaJuridica objeto) {
        bancoPessoasJuridicas.alterar(identificador, objeto);
    }

}
