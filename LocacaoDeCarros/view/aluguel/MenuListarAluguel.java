package view.aluguel;

import service.AluguelService;
import service.InterfaceAluguel;

import java.util.Scanner;

public class MenuListarAluguel {
    public void execute(Scanner scanner){
        InterfaceAluguel aluguelService = new AluguelService();

        aluguelService.listar();
    }

}
