import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contato {
    static Long proximoId = 0L;
    private Long id;
    private String nome;
    private String sobreNome;
    private List<Telefone> telefones = new ArrayList<Telefone>();

    Contato(String nome, String sobreNome, String ddd, Long numero){
        this.id = proximoId;
        this.nome = nome;
        this.sobreNome = sobreNome;
        addTelefone(new Telefone(ddd, numero));
        proximoId++;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void addTelefone(Telefone telefone) {
        if(Telefone.telefoneRepetido(telefone.toString())){
            System.out.println("Telefone já cadastrado.");
        }
        else{
            this.telefones.add(telefone);
            Telefone.proximoId++;
            Telefone.adicionarTelefoneAListaDeTodos(telefone.toString());
        }
    }

    public void editarNome(Scanner sc){
        System.out.println("Digite um novo nome:");
        sc.nextLine();
        this.nome = sc.nextLine();
    }

    public void editarSobrenome(Scanner sc){
        System.out.println("Digite um novo sobrenome:");
        sc.nextLine();
        this.sobreNome = sc.nextLine();
    }

    public void editarTelefone(Scanner sc){
        System.out.println("Digite o ddd do telefone que deseja alterar:");
        String ddd = sc.next();
        System.out.println("Digite o numero do telefone que deseja alterar:");
        Long numero = sc.nextLong();

        Telefone telefoneParaEditar = null;
        boolean encontrado = false;
        for(Telefone telefone: telefones){
            if(telefone.toString().equals("(" + ddd + ") " + numero)){
                telefoneParaEditar = telefone;
                encontrado = true;
            }
        }

        if(encontrado){
            System.out.println("Digite o novo ddd deste telefone:");
            String novoDdd = sc.next();
            System.out.println("Digite o novo numero deste telefone:");
            Long novoNumero = sc.nextLong();

            if(Telefone.telefoneRepetido("(" + novoDdd + ") " + novoNumero)){
                System.out.println("Telefone já cadastrado.");
                return;
            }

            telefoneParaEditar.setDdd(novoDdd);
            telefoneParaEditar.setNumero(novoNumero);
        }
        else{
            System.out.println("Telefone não encontrado.");
        }
    }

    @Override
    public String toString() {
        String result = this.id + " | " + this.nome + " " + this.sobreNome;
        for (Telefone telefone : telefones) {
            result += " | " + telefone;
        }
        return result;
    }
    
}
