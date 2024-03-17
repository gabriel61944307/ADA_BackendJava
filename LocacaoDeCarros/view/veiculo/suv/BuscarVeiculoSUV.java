package view.veiculo.suv;

import dominio.CarroSUV;
import service.CarroSUVService;
import service.Service;

import java.util.Scanner;

public class BuscarVeiculoSUV {
    public void execute(Scanner scanner){
        Service<CarroSUV> carroService = new CarroSUVService();

        System.out.println("Placa: ");
        String placa = scanner.nextLine();

        System.out.println(carroService.buscar(placa));
    }
}
