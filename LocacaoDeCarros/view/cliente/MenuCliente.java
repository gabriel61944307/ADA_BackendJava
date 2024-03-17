package view.cliente;

import view.cliente.PessoaFisica.MenuPessoaFisica;
import view.cliente.PessoaJuridica.MenuPessoaJuridica;

import java.util.Scanner;

public class MenuCliente {
    public void execute(Scanner scanner){
        System.out.println("Escolha uma opção:");
        System.out.println("0 - Voltar");
        System.out.println("1 - Pessoa Fisica");
        System.out.println("2 - Pessoa Juridica");

        Integer option = Integer.valueOf(scanner.nextLine());
        switch (option){
            case 1: new MenuPessoaFisica().execute(scanner);
                break;
            case 2: new MenuPessoaJuridica().execute(scanner);
                break;
            case 0:
                return;
        }

        execute(scanner);
    }
}
