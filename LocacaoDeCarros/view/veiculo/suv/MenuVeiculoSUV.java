package view.veiculo.suv;

import java.util.Scanner;

public class MenuVeiculoSUV {
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
            case 1: new CadastrarVeiculoSUV().execute(scanner);
                break;
            case 2: new EditarVeiculoSUV().execute(scanner);
                break;
            case 3: new ExcluirVeiculoSUV().execute(scanner);
                break;
            case 4: new BuscarVeiculoSUV().execute(scanner);
                break;
            case 5: new BuscarVeiculoSUVPorNome().execute(scanner);
                break;
            case 6: new ListarVeiculoSUV().execute(scanner);
                break;
            case 0:
                return;
        }

        execute(scanner);
    }
}
