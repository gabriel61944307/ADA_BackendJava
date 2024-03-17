package view.veiculo.suv;

import dominio.CarroSUV;
import service.CarroSUVService;
import service.Service;

import java.util.Scanner;

public class ExcluirVeiculoSUV {
    public void execute(Scanner scanner){
        Service<CarroSUV> carroService = new CarroSUVService();

        System.out.println("Placa: ");
        String placa = scanner.nextLine();

        carroService.remover(placa);
    }
}
