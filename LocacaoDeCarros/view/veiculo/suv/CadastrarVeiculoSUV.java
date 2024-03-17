package view.veiculo.suv;

import dominio.CarroSUV;
import service.CarroSUVService;
import service.Service;

import java.util.Scanner;

public class CadastrarVeiculoSUV {
    public void execute(Scanner scanner){
        Service<CarroSUV> carroService = new CarroSUVService();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Placa: ");
        String placa = scanner.nextLine();
        System.out.println("Km/l: ");
        String km_l = scanner.nextLine();


        CarroSUV carro = new CarroSUV(nome, placa, Double.valueOf(km_l));

        carroService.salvar(carro);
    }
}
