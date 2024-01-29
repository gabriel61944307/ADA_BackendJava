import java.util.List;
import java.util.ArrayList;

public class Telefone {
    static List<String> todosTelefones = new ArrayList<String>();
    static Long proximoId = 0L;
    private Long id;
    private String ddd;
    private Long numero;

    Telefone(String ddd, long numero){
        this.id = proximoId;
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public Long getNumero() {
        return numero;
    }

    static boolean telefoneRepetido(String telefone){
        for (String telefoneJaCadastrado : todosTelefones){
            if(telefoneJaCadastrado.equals(telefone)) return true;
        }
        return false;
    }

    static void adicionarTelefoneAListaDeTodos(String telefone){
        todosTelefones.add(telefone);
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "(" + ddd + ") " + numero;
    }
}
