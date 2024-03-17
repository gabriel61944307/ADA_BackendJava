package view.cliente.PessoaFisica;

import dominio.PessoaFisica;
import service.PessoaFisicaService;
import service.Service;

import java.util.Collection;
import java.util.Scanner;

public class ListarPessoasFisicas {
    public void execute(Scanner scanner){
        Service<PessoaFisica> pessoaService = new PessoaFisicaService();
        Collection<PessoaFisica> pessoas = pessoaService.buscarTodos();
        for(PessoaFisica pessoa : pessoas){
            System.out.println(pessoa);
        }
    }
}
