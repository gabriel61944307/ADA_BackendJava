package view.veiculo.medio;

import dominio.CarroMedio;
import service.CarroMedioService;
import service.Service;

import java.util.Scanner;

public class EditarVeiculoMedio {
    public void execute(Scanner scanner){
        Service<CarroMedio> carroService = new CarroMedioService();

        System.out.println("Placa: ");
        String placa = scanner.nextLine();
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Km/l: ");
        String km_l = scanner.nextLine();

        CarroMedio carro = new CarroMedio(nome, placa, Double.valueOf(km_l));

        carroService.alterar(carro.getPlaca(), carro);
    }
}
