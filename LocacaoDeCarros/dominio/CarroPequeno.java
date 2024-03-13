package dominio;

public class CarroPequeno extends Veiculo{
    public static Double precoDiaria = 100.0;
    public CarroPequeno(String placa) {
        super(placa);
    }

    @Override
    public String getPropaganda() {
        return "Carro perfeito para a cidade, baixo consumo e alta eficiência.";
    }
}
