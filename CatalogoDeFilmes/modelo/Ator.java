package CatalogoDeFilmes.modelo;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Ator extends Pessoa{
    private Set<Filme> filmesParticipados = new HashSet<>();
    public Ator(String nome, LocalDate dataNascimento, LocalNascimento localNascimento) {
        super(nome, dataNascimento, localNascimento);
    }

    public Set<Filme> getFilmesParticipados() {
        return filmesParticipados;
    }

    public void addFilmeParticipado(Filme filme){
        filmesParticipados.add(filme);
    }

    public void excluirFilme(Filme filme){
        filmesParticipados.remove(filme);
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
