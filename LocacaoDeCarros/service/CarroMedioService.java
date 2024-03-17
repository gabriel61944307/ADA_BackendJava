package service;

import BancoDeDados.BD;
import dominio.CarroMedio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CarroMedioService implements Service<CarroMedio>, InterfaceCarro<CarroMedio>{
    static  private final BD<String, CarroMedio> bancoCarroMedio = new BD<>();


    @Override
    public List<CarroMedio> buscarCarro(String nome) {
        List<CarroMedio> carrosComEsseNome = new ArrayList<>();

        for(CarroMedio carro : bancoCarroMedio.buscarTodos()){
            if(carro.getNome().contains(nome))
                carrosComEsseNome.add(carro);
        }

        return carrosComEsseNome;
    }

    @Override
    public void salvar(CarroMedio carro) {
        bancoCarroMedio.salvar(carro.getPlaca(), carro);
    }

    @Override
    public Collection<CarroMedio> buscarTodos() {
        return bancoCarroMedio.buscarTodos();
    }

    @Override
    public CarroMedio buscar(String identificador) {
        return bancoCarroMedio.buscar(identificador);
    }

    @Override
    public void remover(String identificador) {
        bancoCarroMedio.remover(identificador);
    }

    @Override
    public void alterar(String identificador, CarroMedio carro) {
        bancoCarroMedio.alterar(identificador, carro);
    }
}
