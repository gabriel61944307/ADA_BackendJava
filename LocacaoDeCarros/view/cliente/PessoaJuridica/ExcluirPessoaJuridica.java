package view.cliente.PessoaJuridica;

import dominio.PessoaJuridica;
import service.PessoaJuridicaService;
import service.Service;

import java.util.Scanner;

public class ExcluirPessoaJuridica {
    public void execute(Scanner scanner){
        Service<PessoaJuridica> pessoaService = new PessoaJuridicaService();

        System.out.println("CPF: ");
        String cpf = scanner.nextLine();

        pessoaService.remover(cpf);
    }
}
