package CatalogoDeFilmes.modelo;

public class LocalNascimento {
    private String pais;
    private String estadoProvinciaRegiao;
    private String cidadeDistrito;

    LocalNascimento(String pais, String estadoProvinciaRegiao, String cidadeDistrito){
        this.pais = pais;
        this.estadoProvinciaRegiao = estadoProvinciaRegiao;
        this.cidadeDistrito = cidadeDistrito;
    }
    public String getPais() { return pais; }

    public void setPais(String pais) { this.pais = pais; }

    public String getEstadoProvinciaRegiao() { return estadoProvinciaRegiao; }

    public void setEstadoProvinciaRegiao(String estadoProvinciaRegiao) { this.estadoProvinciaRegiao = estadoProvinciaRegiao; }

    public String getCidadeDistrito() { return cidadeDistrito; }

    public void setCidadeDistrito(String cidadeDistrito) { this.cidadeDistrito = cidadeDistrito; }

    @Override
    public String toString() {
        return pais + ", " + estadoProvinciaRegiao + ", " + cidadeDistrito;
    }
}
