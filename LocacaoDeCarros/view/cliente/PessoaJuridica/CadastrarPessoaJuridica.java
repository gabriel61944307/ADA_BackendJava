package view.cliente.PessoaJuridica;

import dominio.PessoaJuridica;
import service.PessoaJuridicaService;
import service.Service;

import java.util.Scanner;

public class CadastrarPessoaJuridica {
    public void execute(Scanner scanner){
        Service<PessoaJuridica> pessoaService = new PessoaJuridicaService();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();

        PessoaJuridica pessoa = new PessoaJuridica(nome, cpf);

        pessoaService.salvar(pessoa);
    }
}
