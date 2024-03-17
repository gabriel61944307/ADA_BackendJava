package dominio;

public class PessoaJuridica extends Cliente{
    public PessoaJuridica(String nome, String cnpj) {
        super(nome, cnpj);
    }

    public String getCnpj(){
        return super.getIdentificador();
    }

    @Override
    public String toString() {
        String impressao = this.getCnpj() + " : " + this.getNome();

        for(Veiculo carro : this.getHistoricoVeiculosAlugados()){
            impressao += "\n" + carro.getNome();
        }

        return impressao;
    }
}
