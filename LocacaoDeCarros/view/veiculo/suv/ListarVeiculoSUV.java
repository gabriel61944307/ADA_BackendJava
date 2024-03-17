package view.veiculo.suv;

import dominio.CarroSUV;
import service.CarroSUVService;
import service.Service;

import java.util.Scanner;

public class ListarVeiculoSUV {
    public void execute(Scanner scanner){
        Service<CarroSUV> carroService = new CarroSUVService();

        for(CarroSUV carro : carroService.buscarTodos()){
            System.out.println(carro);
        }
    }
}
