package dominio;

public class CarroSUV extends Veiculo{
    private String propaganda = "Carro espaçoso perfeito para familias grandes, viagens longas se tornam confortáveis neste veículo.";
    public static Double precoDiaria = 200.0;
    public CarroSUV(String nome, String placa, Double km_l) {
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
