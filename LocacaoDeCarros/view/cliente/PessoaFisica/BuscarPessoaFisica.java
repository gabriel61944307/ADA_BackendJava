package view.cliente.PessoaFisica;

import dominio.PessoaFisica;
import service.PessoaFisicaService;
import service.Service;

import java.util.Scanner;

public class BuscarPessoaFisica {
    public void execute(Scanner scanner){
        Service<PessoaFisica> pessoaService = new PessoaFisicaService();

        System.out.println("CPF: ");
        String cpf = scanner.nextLine();

        System.out.println(pessoaService.buscar(cpf));
    }
}
