public class Telefone {
    private Long id;
    private String ddd;
    private Long numero;

    Telefone(String ddd, long numero){
        this.ddd = ddd;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "(" + ddd + ") " + numero;
    }
}
