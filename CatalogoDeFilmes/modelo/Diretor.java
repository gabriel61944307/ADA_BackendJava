package CatalogoDeFilmes.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Diretor extends Pessoa{
    private List<Filme> filmesDirigidos = new ArrayList<Filme>();
    public Diretor(String nome, LocalDate dataNascimento, LocalNascimento localNascimento) {
        super(nome, dataNascimento, localNascimento);
    }

    public List<Filme> getFilmesDirigidos() {
        return filmesDirigidos;
    }

    public void addFilmeDirigido(Filme filme){
        filmesDirigidos.add(filme);
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
