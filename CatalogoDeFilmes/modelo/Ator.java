package CatalogoDeFilmes.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ator extends Pessoa{
    private List<Filme> filmesParticipados = new ArrayList<Filme>();
    public Ator(String nome, LocalDate dataNascimento, LocalNascimento localNascimento) {
        super(nome, dataNascimento, localNascimento);
    }

    public List<Filme> getFilmesParticipados() {
        return filmesParticipados;
    }

    public void addFilmeParticipado(Filme filme){
        filmesParticipados.add(filme);
    }
    @Override
    public String toString() {
        String informacoes = "Nome: " + getNome() + "\n";
        informacoes += "Data de nascimento: " + getDataNascimento() + "\n";
        informacoes += "Local de nascimento: " + getLocalNascimento() + "\n";
        informacoes += "Filmes participados:\n";
        for(Filme filme : filmesParticipados){
            informacoes += "    - " + filme.getNome() + "\n";
        }
        return  informacoes;
    }
}
