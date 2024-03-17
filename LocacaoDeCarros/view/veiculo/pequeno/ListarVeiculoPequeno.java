package view.veiculo.pequeno;

import dominio.CarroPequeno;
import service.CarroPequenoService;
import service.Service;

import java.util.Scanner;

public class ListarVeiculoPequeno {
    public void execute(Scanner scanner){
        Service<CarroPequeno> carroService = new CarroPequenoService();

        for(CarroPequeno carro : carroService.buscarTodos()){
            System.out.println(carro);
        }
    }
}
