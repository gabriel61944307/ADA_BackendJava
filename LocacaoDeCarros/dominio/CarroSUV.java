package dominio;

public class CarroSUV extends Veiculo{
    public static Double precoDiaria = 200.0;
    public CarroSUV(String placa) {
        super(placa);
    }

    @Override
    public String getPropaganda() {
        return "Carro espaçoso perfeito para familias grandes, viagens longas se tornam confortáveis neste veículo.";
    }
}
