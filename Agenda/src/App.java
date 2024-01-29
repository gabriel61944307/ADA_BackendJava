import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        System.out.println("##################");
        System.out.println("##### AGENDA #####");
        System.out.println("##################");
        System.out.println();
        System.out.println(">>>> Menu <<<<");
        System.out.println("1 - Adicionar Contato");
        System.out.println("2 - Remover Contato");
        System.out.println("3 - Editar Contato");
        System.out.println("4 - Imprimir Contatos");
        System.out.println("5 - Sair");

        System.out.println("Escolha uma opção: ");
        int opcao = sc.nextInt();
        while (opcao != 5) {
            switch (opcao) {
                case 1:
                    agenda.adicionarContato(sc);
                    break;

                case 2:
                    agenda.removerContato(sc);
                    break;

                case 3:
                    agenda.editarContato(sc);
                    break;

                case 4:
                    agenda.imprimirContatos();
                    break;
            }
            if(opcao > 5 || opcao < 1) {
                System.out.println("Opção escolhida invalida.");
            }
            System.out.println("Escolha uma opção de contato: (1:Adicionar, 2:Remover,  3:Editar, 4:Imprimir, 5:Sair)");
            opcao = sc.nextInt();
        }

        agenda.salvar();
        sc.close();
    }
}
