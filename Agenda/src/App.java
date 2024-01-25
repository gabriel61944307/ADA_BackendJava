import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        
        agenda.imprimirMenu();

        int opcao = sc.nextInt();
        while (opcao != 5) {
            switch (opcao) {
                case 1:
                    agenda.adicionarContato();
                    break;
                case 2:
                    agenda.removerContato();
                    break;
                case 3:
                    agenda.editarContato();
                    break;
                case 4:
                    agenda.imprimirContatos();
                    break;
            }
            if(opcao > 5 || opcao < 1) {
                System.out.println("Opção escolhida invalida, tente uma das opções disponíveis no menu");
                agenda.imprimirMenu();
            }
        }

    }
}
