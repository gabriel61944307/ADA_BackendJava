package CatalogoDeFilmes.modelo;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Diretor extends Pessoa{
    private Set<Filme> filmesDirigidos = new HashSet<>();
    public Diretor(String nome, LocalDate dataNascimento, LocalNascimento localNascimento) {
        super(nome, dataNascimento, localNascimento);
    }

    public Set<Filme> getFilmesDirigidos() {
        return filmesDirigidos;
    }

    public void addFilmeDirigido(Filme filme){
        filmesDirigidos.add(filme);
    }

    public void excluirFilme(Filme filme){
        filmesDirigidos.remove(filme);
    }
    @Override
    public String toString() {
        String informacoes = "Nome: " + getNome() + "\n";
        informacoes += "Data de nascimento: " + getDataNascimento() + "\n";
        informacoes += "Local de nascimento: " + getLocalNascimento() + "\n";
        informacoes += "Filmes dirigidos:\n";
        for(Filme filme : filmesDirigidos){
            informacoes += "    - " + filme.getNome() + "\n";
        }
        return  informacoes;
    }

}
