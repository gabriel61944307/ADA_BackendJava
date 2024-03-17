package view.cliente.PessoaFisica;

import java.util.Scanner;

public class MenuPessoaFisica {
    public void execute(Scanner scanner){
        System.out.println("Escolha uma opção:");
        System.out.println("0 - Voltar");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Editar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Buscar");
        System.out.println("5 - Listar");

        Integer option = Integer.valueOf(scanner.nextLine());
        switch (option){
            case 1: new CadastrarPessoaFisica().execute(scanner);
                break;
            case 2: new EditarPessoaFisica().execute(scanner);
                break;
            case 3: new ExcluirPessoaFisica().execute(scanner);
                break;
            case 4: new BuscarPessoaFisica().execute(scanner);
                break;
            case 5: new ListarPessoasFisicas().execute(scanner);
                break;
            case 0:
                return;
        }

        execute(scanner);
    }
}
