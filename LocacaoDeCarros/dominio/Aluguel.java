package dominio;

import java.time.LocalDateTime;

public class Aluguel<C extends Cliente, V extends Veiculo> {
    private Cliente cliente;
    private Veiculo veiculo;
    private String local;
    private LocalDateTime momentoRetirada;
    private LocalDateTime momentoDevolucao;
    private Double total;

    public Aluguel(C cliente, V veiculo, String local, LocalDateTime momentoRetirada){
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.local = local;
        this.momentoRetirada = momentoRetirada;
    }

    public String getLocal() {
        return local;
    }

    public LocalDateTime getMomentoRetirada() {
        return momentoRetirada;
    }

    public LocalDateTime getMomentoDevolucao() {
        return momentoDevolucao;
    }

    public void setMomentoDevolucao(LocalDateTime momentoDevolucao) {
        this.momentoDevolucao = momentoDevolucao;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    @Override
    public String toString() {
        String impressao = this.cliente.getNome() + " - " + this.veiculo.getNome() + " - " + this.local +  " - Alugado em:" + this.momentoRetirada;
        if(this.momentoDevolucao != null) impressao += " Devolvido em: " + this.momentoDevolucao;
        else impressao += " Carro ainda não devolvido - ";
        if(this.total != null) impressao += " Valor total do aluguel: " + this.total + "R$";
        return impressao;
    }
}
