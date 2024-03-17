package dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    private String nome;
    private String identificador;
    private List<Veiculo> historicoVeiculosAlugados = new ArrayList<>();
    private List<Veiculo> veiculosAlugadosHoje = new ArrayList<>();

    public Cliente(String nome, String identificador){
        this.nome = nome;
        this.identificador = identificador;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    protected String getIdentificador() {
        return identificador;
    }

    public void addVeiculo(Veiculo veiculo){
        veiculosAlugadosHoje.add(veiculo);
        historicoVeiculosAlugados.add(veiculo);
    }

    public void devolverVeiculo(Veiculo veiculo){
        veiculosAlugadosHoje.remove(veiculo);
    }

    public List<Veiculo> getHistoricoVeiculosAlugados() {
        return historicoVeiculosAlugados;
    }

    public List<Veiculo> getVeiculosAlugadosHoje() {
        return veiculosAlugadosHoje;
    }
}
