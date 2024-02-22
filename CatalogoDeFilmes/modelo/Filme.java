package CatalogoDeFilmes.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private LocalDate dataLancamento;
    private BigDecimal orcamento;
    private String descricao;
    private Diretor diretor;
    private List<Ator> atores = new ArrayList<Ator>();

}
