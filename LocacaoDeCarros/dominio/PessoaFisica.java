package dominio;

public class PessoaFisica extends Cliente{
    public PessoaFisica(String nome, String cpf) {
        super(nome, cpf);
    }

    public String getCpf(){
        return super.getIdentificador();
    }
}
