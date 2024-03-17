package service;

import BancoDeDados.BD;
import dominio.CarroPequeno;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CarroPequenoService implements Service<CarroPequeno>, InterfaceCarro<CarroPequeno>{
    static  private final BD<String, CarroPequeno> bancoCarroPequeno = new BD<>();

    @Override
    public List<CarroPequeno> buscarCarro(String nome) {
        List<CarroPequeno> carrosComEsseNome = new ArrayList<>();

        for(CarroPequeno carro : bancoCarroPequeno.buscarTodos()){
            if(carro.getNome().contains(nome))
                carrosComEsseNome.add(carro);
        }

        return carrosComEsseNome;
    }

    @Override
    public void salvar(CarroPequeno carro) {
        bancoCarroPequeno.salvar(carro.getPlaca(), carro);
    }

    @Override
    public Collection<CarroPequeno> buscarTodos() {
        return bancoCarroPequeno.buscarTodos();
    }

    @Override
    public CarroPequeno buscar(String identificador) {
        return bancoCarroPequeno.buscar(identificador);
    }

    @Override
    public void remover(String identificador) {
        bancoCarroPequeno.remover(identificador);
    }

    @Override
    public void alterar(String identificador, CarroPequeno carro) {
        bancoCarroPequeno.alterar(identificador, carro);
    }
}
