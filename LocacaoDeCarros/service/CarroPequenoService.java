package service;

import BancoDeDados.BD;
import dominio.CarroPequeno;

import java.util.Collection;

public class CarroPequenoService implements Service{
    static  private final BD<String, CarroPequeno> bancoCarroPequeno = new BD<>();
    @Override
    public void salvar(Object objeto) {
        CarroPequeno carro = (CarroPequeno) objeto;
        bancoCarroPequeno.salvar(carro.getPlaca(), carro);
    }

    @Override
    public Collection<CarroPequeno> buscarTodos() {
        return bancoCarroPequeno.buscarTodos();
    }

    @Override
    public Object buscar(String identificador) {
        return bancoCarroPequeno.buscar(identificador);
    }

    @Override
    public void remover(String identificador) {
        bancoCarroPequeno.remover(identificador);
    }

    @Override
    public void alterar(String identificador, Object objeto) {
        CarroPequeno carro = (CarroPequeno) objeto;
        bancoCarroPequeno.alterar(identificador, carro);
    }
}
