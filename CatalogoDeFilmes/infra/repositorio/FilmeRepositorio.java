package CatalogoDeFilmes.infra.repositorio;

import CatalogoDeFilmes.infra.BD.BancoDeDados;
import CatalogoDeFilmes.modelo.Ator;
import CatalogoDeFilmes.modelo.Diretor;
import CatalogoDeFilmes.modelo.Filme;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilmeRepositorio implements InterfaceRepositorio{
    static Long proximoCodigo = 0L;
    private HashMap<Long, Filme> listaFilmes = BancoDeDados.getFilmes();

    @Override
    public boolean gravar(Object objeto) {
        Filme filme = (Filme) objeto;

        List<Diretor> diretores = filme.getDiretores();
        for(Diretor diretor : diretores){
            diretor.addFilmeDirigido(filme);
        }

        listaFilmes.put(proximoCodigo, filme);
        proximoCodigo++;
        return true;
    }

    @Override
    public boolean atualizar(Long codigo, Object objeto) {
        Filme filme = (Filme) objeto;
        if(listaFilmes.containsKey(codigo)){
            List<Diretor> diretores = filme.getDiretores();
            List<Ator> atores = filme.getAtores();

            for (Diretor diretor : diretores){
                if(!diretor.getFilmesDirigidos().contains(filme)){
                    diretor.addFilmeDirigido(filme);
                }
            }

            for(Ator ator : atores){
                if(!ator.getFilmesParticipados().contains(filme)){
                    ator.addFilmeParticipado(filme);
                }
            }

            listaFilmes.put(codigo, filme);
            return true;
        }
        return false;
    }

    @Override
    public boolean excluir(Long codigo) {
        if(listaFilmes.containsKey(codigo)){
            listaFilmes.remove(codigo);
            return true;
        }
        return false;
    }

    @Override
    public Filme buscarPorCodigo(Long codigo) {
        if(listaFilmes.containsKey(codigo)){
            return listaFilmes.get(codigo);
        }
        return null;
    }

    @Override
    public void listarTodos() {
        for(Map.Entry<Long, Filme> filme : listaFilmes.entrySet()){
            System.out.println("Código: " + filme.getKey() + "\n" + filme.getValue());
        }
    }

    @Override
    public void listarPorId(Long codigo) {
        if(listaFilmes.containsKey(codigo)){
            System.out.println("Código: " + codigo + "\n" + listaFilmes.get(codigo));
        }
    }

    public void listarPorNome(String nome){
        String nomeMaiusculo = nome.toUpperCase();
        for(Map.Entry<Long, Filme> filme : listaFilmes.entrySet()){
            String filmeMaiusculo = filme.getValue().getNome().toUpperCase();
            if(filmeMaiusculo.contains(nomeMaiusculo)){
                System.out.println(filme.getValue() + "\n");
            }
        }
    }

}
