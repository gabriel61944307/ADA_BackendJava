package view.veiculo.pequeno;

import dominio.CarroPequeno;
import service.CarroPequenoService;
import service.Service;

import java.util.Scanner;

public class ExcluirVeiculoPequeno {
    public void execute(Scanner scanner){
        Service<CarroPequeno> carroService = new CarroPequenoService();

        System.out.println("Placa: ");
        String placa = scanner.nextLine();

        carroService.remover(placa);
    }
}
