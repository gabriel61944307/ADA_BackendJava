import java.util.List;
import java.util.ArrayList;

public class Agenda {
    List<Contato> contatos = new ArrayList<Contato>();
    
    public void adicionarContato(String nome, String sobreNome){
        contatos.add(new Contato(nome, sobreNome));
    }

    public void imprimirContatos(){
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    public void imprimirMenu(){
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
    }
}
