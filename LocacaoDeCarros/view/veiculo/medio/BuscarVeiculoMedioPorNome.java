package view.veiculo.medio;

import dominio.CarroMedio;
import service.CarroMedioService;
import service.InterfaceCarro;

import java.util.Scanner;

public class BuscarVeiculoMedioPorNome {
    public void execute(Scanner scanner){
        InterfaceCarro<CarroMedio> carroService = new CarroMedioService();

        System.out.println("Parte do nome: ");
        String nome = scanner.nextLine();

        System.out.println(carroService.buscarCarro(nome));
    }
}
