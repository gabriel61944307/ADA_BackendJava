package view.veiculo;

import view.veiculo.medio.MenuVeiculoMedio;
import view.veiculo.pequeno.MenuVeiculoPequeno;
import view.veiculo.suv.MenuVeiculoSUV;

import java.util.Scanner;

public class MenuVeiculo {
    public void execute(Scanner scanner){
        System.out.println("Escolha uma opção:");
        System.out.println("0 - Voltar");
        System.out.println("1 - Veiculo pequeno");
        System.out.println("2 - Veiculo Médio");
        System.out.println("3 - SUV");

        Integer option = Integer.valueOf(scanner.nextLine());
        switch (option){
            case 1: new MenuVeiculoPequeno().execute(scanner);
                break;
            case 2: new MenuVeiculoMedio().execute(scanner);
                break;
            case 3: new MenuVeiculoSUV().execute(scanner);
                break;

            case 0:
                return;
        }

        execute(scanner);
    }
}
