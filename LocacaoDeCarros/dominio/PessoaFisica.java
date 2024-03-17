package dominio;

public class PessoaFisica extends Cliente{
    public PessoaFisica(String nome, String cpf) {
        super(nome, cpf);
    }

    public String getCpf(){
        return super.getIdentificador();
    }

    @Override
    public String toString() {
        String impressao = this.getCpf() + " : " + this.getNome();

        for(Veiculo carro : this.getHistoricoVeiculosAlugados()){
            impressao += "\n" + carro.getNome();
        }

        return impressao;
    }
}
