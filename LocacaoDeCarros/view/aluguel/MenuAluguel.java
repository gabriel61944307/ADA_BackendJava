package view.aluguel;

import java.util.Scanner;

public class MenuAluguel {
    public void execute(Scanner scanner){
        System.out.println("Escolha uma opção:");
        System.out.println("0 - Voltar");
        System.out.println("1 - Alugar");
        System.out.println("2 - Devolver");
        System.out.println("3 - Listar alugueis");

        Integer option = Integer.valueOf(scanner.nextLine());
        switch (option){
            case 1: new MenuAlugar().execute(scanner);
                break;
            case 2: new MenuDevolver().execute(scanner);
                break;
            case 3: new MenuListarAluguel().execute(scanner);
                break;

            case 0:
                return;
        }

        execute(scanner);
    }
}
