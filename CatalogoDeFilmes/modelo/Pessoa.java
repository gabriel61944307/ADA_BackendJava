package CatalogoDeFilmes.modelo;

import java.time.LocalDate;

public class Pessoa {
    private Long codigo = -1L;
    private String nome;
    private LocalDate dataNascimento;
    private LocalNascimento localNascimento;

    Pessoa(String nome, LocalDate dataNascimento, LocalNascimento localNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.localNascimento = localNascimento;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Long getCodigo() { return codigo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDataNascimento() { return dataNascimento.toString(); }

    public String getLocalNascimento() { return localNascimento.toString(); }
}
