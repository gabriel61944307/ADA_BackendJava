package view.cliente.PessoaJuridica;

import dominio.PessoaJuridica;
import service.PessoaJuridicaService;
import service.Service;

import java.util.Scanner;

public class EditarPessoaJuridica {
    public void execute(Scanner scanner){
        Service<PessoaJuridica> pessoaService = new PessoaJuridicaService();

        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Novo nome: ");
        String nome = scanner.nextLine();


        PessoaJuridica pessoa = new PessoaJuridica(nome, cpf);

        pessoaService.alterar(cpf, pessoa);
    }


}
