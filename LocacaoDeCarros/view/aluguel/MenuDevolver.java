package view.aluguel;

import service.AluguelService;
import service.InterfaceAluguel;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MenuDevolver {
    public void execute(Scanner scanner){
        InterfaceAluguel aluguelService = new AluguelService();

        System.out.println("Codigo do aluguel: ");
        String codigo = scanner.nextLine();
        System.out.println("Agora o momento da sua devolucao");
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

        aluguelService.finalizarAluguel(codigo, LocalDateTime.of(ano, mes, dia, hora, min));
    }
}
