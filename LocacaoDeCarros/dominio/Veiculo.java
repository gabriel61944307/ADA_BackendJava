package dominio;

public abstract class Veiculo {
    private String placa;
    private String nome;
    private boolean alugado = false;
    private Double kmPorL;
    public Veiculo(String nome, String placa, Double kmPorL){
        this.nome = nome;
        this.placa = placa;
        this.kmPorL = kmPorL;
    }

    public String getPlaca() {
        return placa;
    }

    public String getNome() {
        return nome;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public Double getKmPorL() {
        return kmPorL;
    }

    public void setKmPorL(Double kmPorL) {
        this.kmPorL = kmPorL;
    }

    public abstract String getPropaganda();

}
