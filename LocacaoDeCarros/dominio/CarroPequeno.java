package dominio;

public class CarroPequeno extends Veiculo{
    private String propaganda =  "Carro perfeito para a cidade, baixo consumo e alta eficiência.";
    public static Double precoDiaria = 100.0;
    public CarroPequeno(String nome, String placa, Double km_l) {
        super(nome, placa, km_l);
    }

    @Override
    public String getPropaganda() {
        return propaganda;
    }

    public void setPropaganda(String propaganda) {
        this.propaganda = propaganda;
    }

    @Override
    public String toString() {
        String impressao = this.getPlaca() + " - " + this.getNome() + " - " + this.getKmPorL() + " km/l" + "\n" + this.getPropaganda();
        return impressao;
    }
}
