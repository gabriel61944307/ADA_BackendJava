package CatalogoDeFilmes.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Filme {
    private String nome;
    private LocalDate dataLancamento;
    private BigDecimal orcamento;
    private String descricao;
    private Set<Diretor> diretores = new HashSet<>();
    private Set<Ator> atores = new HashSet<>();

    public Filme(String nome, LocalDate dataLancamento, BigDecimal orcamento, String descricao, Diretor diretor){
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.diretores.add(diretor);
    }
    public String getNome() {
        return nome;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public BigDecimal getOrcamento() {
        return orcamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Diretor> getDiretores() {
        return diretores;
    }

    public Set<Ator> getAtores() {
        return atores;
    }

    public void addAtor(Ator ator) {
        this.atores.add(ator);
    }
    public void addDiretor(Diretor diretor) {
        this.diretores.add(diretor);
    }


    @Override
    public String toString() {
        String informacoes = "Nome: " + this.nome + "\n";
        informacoes += "Data de lancamento: " + this.dataLancamento + "\n";
        informacoes += "Orçamento: " + this.orcamento + "\n";
        informacoes += "Descrição: " + this.descricao + "\n";
        informacoes += "Diretores:\n";
        for(Diretor diretor: diretores){
            informacoes += "    - " + diretor.getNome() + "\n";
        }
        informacoes += "Atores:\n";
        for(Ator ator : atores){
            informacoes += "    - " + ator.getNome() + "\n";
        }
        return  informacoes;
    }
}
