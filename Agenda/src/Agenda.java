import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private String nomeArquivo = "agenda.txt";
    List<Contato> contatos = new ArrayList<Contato>();
    Agenda() throws IOException {
        File arquivo = new File(nomeArquivo);

        if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();
                return;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        BufferedReader reader = new BufferedReader(new FileReader(arquivo));
        String linha;

        while ((linha = reader.readLine()) != null) {
            String[] informacoes = linha.split("\\|");
            Contato contato = new Contato(informacoes[1], informacoes[2], informacoes[3], Long.parseLong(informacoes[4]));
            contato.setId(Long.parseLong(informacoes[0]));

            for(int i = 5; i < informacoes.length; i+=2){
                Telefone telefone = new Telefone(informacoes[i], Long.parseLong(informacoes[i+1]));
                contato.addTelefone(telefone);
            }
            this.contatos.add(contato);
            Contato.proximoId = Long.parseLong(informacoes[0]) + 1;
        }
    }
    public void adicionarContato(Scanner sc){
        System.out.print("Digite o nome: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.print("DDD: ");
        String ddd = sc.next();

        boolean entradaValida = false;
        do {
            System.out.print("Número: ");
            if(sc.hasNextLong()){
                entradaValida = true;
                long numero = sc.nextLong();
                if(Telefone.telefoneRepetido("(" + ddd + ") " + numero)){
                    System.out.println("Telefone já está presente na lista de contatos.");
                    return;
                }
                contatos.add(new Contato(nome, sobrenome, ddd, numero));
            }
            else {
                System.out.println("Entrada inválida. Por favor, digite um número válido.");
                sc.next();
            }
        }
        while (!entradaValida);

    }

    public void removerContato(Scanner sc){
        System.out.print("ID do contato que deseja remover: ");
        Long id = sc.nextLong();

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
            System.out.println("O que você deseja editar nesse contato? (1:nome, 2:sobrenome, 3:telefone, 4:adicionar telefone, 5:sair)");
            opcao = sc.nextInt();
        }
    }

    public void imprimirContatos(){
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    public void salvar(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for(Contato contato : contatos){
                String linhaParaSalvar = "";
                linhaParaSalvar += contato.getId() + "|" + contato.getNome() + "|" + contato.getSobreNome();
                List<Telefone> telefones = contato.getTelefones();
                for(Telefone telefone : telefones){
                    linhaParaSalvar += "|" + telefone.getDdd() + "|" + telefone.getNumero();
                }
                writer.write(linhaParaSalvar);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
