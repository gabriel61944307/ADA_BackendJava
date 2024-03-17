package service;

import BancoDeDados.BD;
import dominio.CarroSUV;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CarroSUVService implements Service<CarroSUV>, InterfaceCarro<CarroSUV>{
    static  private final BD<String, CarroSUV> bancoCarroSUV = new BD<>();

    @Override
    public List<CarroSUV> buscarCarro(String nome) {
        List<CarroSUV> carrosComEsseNome = new ArrayList<>();

        for(CarroSUV carro : bancoCarroSUV.buscarTodos()){
            if(carro.getNome().contains(nome))
                carrosComEsseNome.add(carro);
        }

        return carrosComEsseNome;
    }

    @Override
    public void salvar(CarroSUV carro) {
        bancoCarroSUV.salvar(carro.getPlaca(), carro);
    }

    @Override
    public Collection<CarroSUV> buscarTodos() {
        return bancoCarroSUV.buscarTodos();
    }

    @Override
    public CarroSUV buscar(String identificador) {
        return bancoCarroSUV.buscar(identificador);
    }

    @Override
    public void remover(String identificador) {
        bancoCarroSUV.remover(identificador);
    }

    @Override
    public void alterar(String identificador, CarroSUV carro) {
        bancoCarroSUV.alterar(identificador, carro);
    }
}
