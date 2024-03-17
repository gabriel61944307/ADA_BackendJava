package view.cliente.PessoaFisica;

import dominio.PessoaFisica;
import service.PessoaFisicaService;
import service.Service;

import java.util.Scanner;

public class CadastrarPessoaFisica {
    public void execute(Scanner scanner){
        Service<PessoaFisica> pessoaService = new PessoaFisicaService();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();

        PessoaFisica pessoa = new PessoaFisica(nome, cpf);

        pessoaService.salvar(pessoa);
    }
}
