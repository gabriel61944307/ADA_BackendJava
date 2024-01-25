import java.util.List;

public class Contato {
    private Long id;
    private String nome;
    private String sobreNome;
    private List<Telefone> telefones;

    Contato(String nome, String sobreNome){
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getSobreNome() {
        return sobreNome;
    }

    @Override
    public String toString() {
        String result = this.nome + " " + this.sobreNome;
        for (Telefone telefone : telefones) {
            result += " | " + telefone;
        }
        return result;
    }
    
}
