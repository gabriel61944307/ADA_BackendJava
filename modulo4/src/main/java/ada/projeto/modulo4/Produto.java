package ada.projeto.modulo4;

import java.math.BigDecimal;

public class Produto {
    private Long id;
    private String nome;
    private Integer quantidade;
    private String categoria;
    private BigDecimal preco;

    public Produto(){}

    public Produto(Long id, String nome, Integer quantidade, String categoria, BigDecimal preco){
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\nId: " + this.id + "\nNome:" + this.nome +"\nQuantidade: " + this.quantidade + "\nCategoria: " + this.categoria + "\nPreco: " + this.preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
