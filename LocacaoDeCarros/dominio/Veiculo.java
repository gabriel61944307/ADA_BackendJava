package dominio;

public abstract class Veiculo {
    private String placa;
    private boolean alugado = false;
    private Double kmPorL;
    public Veiculo(String placa){
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
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
