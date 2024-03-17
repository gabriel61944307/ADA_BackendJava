package view.veiculo.medio;

import dominio.CarroMedio;
import service.CarroMedioService;
import service.Service;

import java.util.Scanner;

public class BuscarVeiculoMedio {
    public void execute(Scanner scanner){
        Service<CarroMedio> carroService = new CarroMedioService();

        System.out.println("Placa: ");
        String placa = scanner.nextLine();

        System.out.println(carroService.buscar(placa));
    }
}
