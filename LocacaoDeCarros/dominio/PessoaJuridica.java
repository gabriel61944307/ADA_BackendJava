package dominio;

public class PessoaJuridica extends Cliente{
    public PessoaJuridica(String nome, String cnpj) {
        super(nome, cnpj);
    }

    public String getCnpj(){
        return super.getIdentificador();
    }
}