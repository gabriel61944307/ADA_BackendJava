package dominio;

public class CarroMedio extends Veiculo{
    private String propaganda = "Carro perfeito para uma família média que gosta de viajar, bom para a cidade e para a estrada.";
    public static Double precoDiaria = 150.0;
    public CarroMedio(String nome, String placa, Double km_l) {
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
