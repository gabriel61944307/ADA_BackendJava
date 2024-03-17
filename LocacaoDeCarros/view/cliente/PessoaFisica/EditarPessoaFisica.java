package view.cliente.PessoaFisica;

import dominio.PessoaFisica;
import service.PessoaFisicaService;
import service.Service;

import java.util.Scanner;

public class EditarPessoaFisica {
    public void execute(Scanner scanner){
        Service<PessoaFisica> pessoaService = new PessoaFisicaService();

        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Novo nome: ");
        String nome = scanner.nextLine();


        PessoaFisica pessoa = new PessoaFisica(nome, cpf);

        pessoaService.alterar(cpf, pessoa);
    }


}
