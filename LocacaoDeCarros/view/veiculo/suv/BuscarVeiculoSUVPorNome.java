package view.veiculo.suv;

import dominio.CarroSUV;
import service.CarroSUVService;
import service.InterfaceCarro;

import java.util.Scanner;

public class BuscarVeiculoSUVPorNome {
    public void execute(Scanner scanner){
        InterfaceCarro<CarroSUV> carroService = new CarroSUVService();

        System.out.println("Parte do nome: ");
        String nome = scanner.nextLine();

        System.out.println(carroService.buscarCarro(nome));
    }
}
