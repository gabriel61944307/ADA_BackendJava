package view.veiculo.medio;

import dominio.CarroMedio;
import service.CarroMedioService;
import service.Service;

import java.util.Scanner;

public class ListarVeiculoMedio {
    public void execute(Scanner scanner){
        Service<CarroMedio> carroService = new CarroMedioService();

        for(CarroMedio carro : carroService.buscarTodos()){
            System.out.println(carro);
        }
    }
}
