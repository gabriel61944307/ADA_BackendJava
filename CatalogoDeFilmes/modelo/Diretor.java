package CatalogoDeFilmes.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Diretor extends Pessoa{
    private List<Filme> filmesDirigidos = new ArrayList<Filme>();
    Diretor(String nome, LocalDate dataNascimento, String pais, String estadoProvinciaRegiao, String cidadeDistrito) {
        super(nome, dataNascimento, pais, estadoProvinciaRegiao, cidadeDistrito);
    }

    public void adicionarFilme(Filme filme){
        filmesDirigidos.add(filme);
    }
    public void listarFilmes(){
        for(Filme filme: filmesDirigidos){
            System.out.println(filme + "\n");
        }
    }

}
