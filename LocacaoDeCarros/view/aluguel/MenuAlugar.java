package view.aluguel;

import service.AluguelService;
import service.InterfaceAluguel;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MenuAlugar {
    public void execute(Scanner scanner){
        InterfaceAluguel aluguelService = new AluguelService();

        System.out.println("CPF ou CNPJ: ");
        String CPF_CNPJ = scanner.nextLine();
        System.out.println("Placa: ");
        String placa = scanner.nextLine();
        System.out.println("Local de retirada: ");
        String local = scanner.nextLine();
        System.out.println("Agora o momento da sua retirada");
        System.out.println("Ano:");
        Integer ano = Integer.valueOf(scanner.nextLine());
        System.out.println("Mes:");
        Integer mes = Integer.valueOf(scanner.nextLine());
        System.out.println("Dia:");
        Integer dia = Integer.valueOf(scanner.nextLine());
        System.out.println("Hora:");
        Integer hora = Integer.valueOf(scanner.nextLine());
        System.out.println("Minuto:");
        Integer min = Integer.valueOf(scanner.nextLine());

        aluguelService.realizarAluguel(CPF_CNPJ, placa, local, LocalDateTime.of(ano, mes, dia, hora, min));
    }
}
