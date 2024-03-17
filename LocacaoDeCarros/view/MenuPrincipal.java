package view;

import view.aluguel.MenuAluguel;
import view.cliente.MenuCliente;
import view.veiculo.MenuVeiculo;

import java.util.Scanner;

public class MenuPrincipal {
    public void execute(Scanner scanner){
        System.out.println("Escolha uma opção:");
        System.out.println("0 - Sair");
        System.out.println("1 - Cliente");
        System.out.println("2 - Carro");
        System.out.println("3 - Aluguel");

        Integer option = Integer.valueOf(scanner.nextLine());
        switch (option){
            case 1: new MenuCliente().execute(scanner);
                break;
            case 2: new MenuVeiculo().execute(scanner);
                break;
            case 3: new MenuAluguel().execute(scanner);
                break;
            case 0:
                System.exit(1);
                break;
        }

        execute(scanner);
    }
}
