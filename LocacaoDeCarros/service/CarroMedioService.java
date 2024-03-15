package service;

import BancoDeDados.BD;
import dominio.CarroMedio;

import java.util.Collection;

public class CarroMedioService implements Service{
    static  private final BD<String, CarroMedio> bancoCarroMedio = new BD<>();
    @Override
    public void salvar(Object objeto) {
        CarroMedio carro = (CarroMedio) objeto;
        bancoCarroMedio.salvar(carro.getPlaca(), carro);
    }

    @Override
    public Collection buscarTodos() {
        return bancoCarroMedio.buscarTodos();
    }

    @Override
    public Object buscar(String identificador) {
        return bancoCarroMedio.buscar(identificador);
    }

    @Override
    public void remover(String identificador) {
        bancoCarroMedio.remover(identificador);
    }

    @Override
    public void alterar(String identificador, Object objeto) {
        CarroMedio carro = (CarroMedio) objeto;
        bancoCarroMedio.alterar(identificador, carro);
    }
}
