package view.veiculo.pequeno;

import dominio.CarroPequeno;
import service.CarroPequenoService;
import service.InterfaceCarro;

import java.util.Scanner;

public class BuscarVeiculoPequenoPorNome {
    public void execute(Scanner scanner){
        InterfaceCarro<CarroPequeno> carroService = new CarroPequenoService();

        System.out.println("Parte do nome: ");
        String nome = scanner.nextLine();

        System.out.println(carroService.buscarCarro(nome));
    }
}
