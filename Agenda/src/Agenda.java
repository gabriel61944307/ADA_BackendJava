import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    List<Contato> contatos = new ArrayList<Contato>();
    
    public void adicionarContato(String nome, String sobrenome, String ddd, Long numero){
        contatos.add(new Contato(nome, sobrenome, ddd, numero));
    }

    public void removerContato(Long id){
        Contato remover = null;
        boolean encontrado = false;
        for(Contato contato : contatos){
            if(contato.getId().equals(id)){
                remover = contato;
                encontrado = true;
            }
        }
        if(encontrado) contatos.remove(remover);
        else System.out.println("Contato não encontrado.");
    }

    public void editarContato(Scanner sc){
        System.out.print("ID do contato que deseja editar: ");
        Long id = sc.nextLong();
        Contato contatoEditar = null;
        boolean encontrado = false;
        for(Contato contato : contatos){
            if(contato.getId().equals(id)){
                contatoEditar = contato;
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Contato não encontrado.");
            return;
        }

        System.out.println("O que você deseja editar?");
        System.out.println("1 - Nome");
        System.out.println("2 - Sobrenome");
        System.out.println("3 - Telefone");
        System.out.println("4 - Adicionar Telefone");
        System.out.println("5 - Sair");

        int opcao = sc.nextInt();
        while(opcao != 5) {
            switch (opcao) {
                case 1:
                    contatoEditar.editarNome(sc);
                    break;

                case 2:
                    contatoEditar.editarSobrenome(sc);
                    break;

                case 3:
                    contatoEditar.editarTelefone(sc);
                    break;
                case 4:
                    System.out.print("Digite o ddd: ");
                    String ddd = sc.next();
                    System.out.print("Digite o numero: ");
                    Long numero = sc.nextLong();
                    contatoEditar.addTelefone(new Telefone(ddd, numero));
            }
            if(opcao > 5 || opcao < 1) {
                System.out.println("Opção escolhida invalida.");
            }
            System.out.println("O que você deseja editar? (1:nome, 2:sobrenome, 3:telefone, 4:adicionar telefone, 5:sair)");
            opcao = sc.nextInt();
        }
    }

    public void imprimirContatos(){
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
}
