package view.veiculo.pequeno;

import dominio.CarroPequeno;
import service.CarroPequenoService;
import service.Service;

import java.util.Scanner;

public class BuscarVeiculoPequeno {
    public void execute(Scanner scanner){
        Service<CarroPequeno> carroService = new CarroPequenoService();

        System.out.println("Placa: ");
        String placa = scanner.nextLine();

        System.out.println(carroService.buscar(placa));
    }
}
