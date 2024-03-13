package dominio;

public class CarroMedio extends Veiculo{
    public static Double precoDiaria = 150.0;
    public CarroMedio(String placa) {
        super(placa);
    }

    @Override
    public String getPropaganda() {
        return "Carro perfeito para uma família média que gosta de viajar, bom para a cidade e para a estrada.";
    }
}
