package view.cliente.PessoaJuridica;

import dominio.PessoaJuridica;
import service.PessoaJuridicaService;
import service.Service;

import java.util.Scanner;

public class BuscarPessoaJuridica {
    public void execute(Scanner scanner){
        Service<PessoaJuridica> pessoaService = new PessoaJuridicaService();

        System.out.println("CPF: ");
        String cpf = scanner.nextLine();

        System.out.println(pessoaService.buscar(cpf));
    }
}
