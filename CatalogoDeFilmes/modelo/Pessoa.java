package CatalogoDeFilmes.modelo;

import java.time.LocalDate;

public class Pessoa {
    static Long proximoCodigo = 0L;
    private Long codigo = -1L;
    private String nome;
    private LocalDate dataNascimento;
    private LocalNascimento localNascimento;

    Pessoa(String nome, LocalDate dataNascimento, String pais, String estadoProvinciaRegiao, String cidadeDistrito){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.localNascimento = new LocalNascimento(pais, estadoProvinciaRegiao, cidadeDistrito);
        this.codigo = proximoCodigo;
        proximoCodigo++;
    }

    public Long getCodigo() { return codigo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDataNascimento() { return dataNascimento.toString(); }

    public String getLocalNascimento() { return localNascimento.toString(); }
}
