package view.veiculo.medio;

import java.util.Scanner;

public class MenuVeiculoMedio {
    public void execute(Scanner scanner){
        System.out.println("Escolha uma opção:");
        System.out.println("0 - Voltar");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Editar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Buscar");
        System.out.println("5 - Buscar por nome");
        System.out.println("6 - Listar");


        Integer option = Integer.valueOf(scanner.nextLine());
        switch (option){
            case 1: new CadastrarVeiculoMedio().execute(scanner);
                break;
            case 2: new EditarVeiculoMedio().execute(scanner);
                break;
            case 3: new ExcluirVeiculoMedio().execute(scanner);
                break;
            case 4: new BuscarVeiculoMedio().execute(scanner);
                break;
            case 5: new BuscarVeiculoMedioPorNome().execute(scanner);
                break;
            case 6: new ListarVeiculoMedio().execute(scanner);
                break;
            case 0:
                return;
        }

        execute(scanner);
    }
}
