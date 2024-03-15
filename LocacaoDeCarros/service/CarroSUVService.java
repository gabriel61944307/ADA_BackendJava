package service;

import BancoDeDados.BD;
import dominio.CarroPequeno;
import dominio.CarroSUV;

import java.util.Collection;

public class CarroSUVService implements Service{
    static  private final BD<String, CarroSUV> bancoCarroSUV = new BD<>();
    @Override
    public void salvar(Object objeto) {
        CarroSUV carro = (CarroSUV) objeto;
        bancoCarroSUV.salvar(carro.getPlaca(), carro);
    }

    @Override
    public Collection buscarTodos() {
        return bancoCarroSUV.buscarTodos();
    }

    @Override
    public Object buscar(String identificador) {
        return bancoCarroSUV.buscar(identificador);
    }

    @Override
    public void remover(String identificador) {
        bancoCarroSUV.remover(identificador);
    }

    @Override
    public void alterar(String identificador, Object objeto) {
        CarroSUV carro = (CarroSUV) objeto;
        bancoCarroSUV.alterar(identificador, carro);
    }
}
