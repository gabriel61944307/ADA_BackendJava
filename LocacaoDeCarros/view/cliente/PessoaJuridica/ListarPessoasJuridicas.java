package view.cliente.PessoaJuridica;

import dominio.PessoaJuridica;
import service.PessoaJuridicaService;
import service.Service;

import java.util.Collection;
import java.util.Scanner;

public class ListarPessoasJuridicas {
    public void execute(Scanner scanner){
        Service<PessoaJuridica> pessoaService = new PessoaJuridicaService();
        Collection<PessoaJuridica> pessoas = pessoaService.buscarTodos();
        for(PessoaJuridica pessoa : pessoas){
            System.out.println(pessoa);
        }
    }
}
