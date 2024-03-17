package view.cliente.PessoaFisica;

import dominio.PessoaFisica;
import service.PessoaFisicaService;
import service.Service;

import java.util.Scanner;

public class ExcluirPessoaFisica {
    public void execute(Scanner scanner){
        Service<PessoaFisica> pessoaService = new PessoaFisicaService();

        System.out.println("CPF: ");
        String cpf = scanner.nextLine();

        pessoaService.remover(cpf);
    }
}
