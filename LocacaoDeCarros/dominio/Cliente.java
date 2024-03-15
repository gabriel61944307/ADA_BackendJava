package dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    private String nome;
    private String identificador;
    private List<Veiculo> veiculosAlugados = new ArrayList<>();

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
        veiculosAlugados.add(veiculo);
    }

    public List<Veiculo> getVeiculosAlugados() {
        return veiculosAlugados;
    }
}
