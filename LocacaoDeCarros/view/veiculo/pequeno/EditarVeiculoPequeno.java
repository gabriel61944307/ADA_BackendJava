package view.veiculo.pequeno;

import dominio.CarroPequeno;
import service.CarroPequenoService;
import service.Service;

import java.util.Scanner;

public class EditarVeiculoPequeno {
    public void execute(Scanner scanner){
        Service<CarroPequeno> carroService = new CarroPequenoService();

        System.out.println("Placa: ");
        String placa = scanner.nextLine();
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Km/l: ");
        String km_l = scanner.nextLine();

        CarroPequeno carro = new CarroPequeno(nome, placa, Double.valueOf(km_l));

        carroService.alterar(carro.getPlaca(), carro);
    }
}
