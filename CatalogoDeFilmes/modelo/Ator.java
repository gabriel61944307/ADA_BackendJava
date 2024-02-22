package CatalogoDeFilmes.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ator extends Pessoa{
    private List<Filme> filmesParticipados = new ArrayList<Filme>();
    public Ator(String nome, LocalDate dataNascimento, String pais, String estadoProvinciaRegiao, String cidadeDistrito) {
        super(nome, dataNascimento, pais, estadoProvinciaRegiao, cidadeDistrito);
    }

    public void adicionarFilme(Filme filme){
        filmesParticipados.add(filme);
    }
    public void listarFilmes(){
        for(Filme filme: filmesParticipados){
            System.out.println(filme + "\n");
        }
    }

    @Override
    public String toString() {
        String informacoes = "Nome: " + getNome() + "\n";
        informacoes += "Data de nascimento: " + getDataNascimento() + "\n";
        informacoes += "Local de nascimento: " + getLocalNascimento() + "\n";
        return  informacoes;
    }
}
