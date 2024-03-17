package service;

import dominio.Veiculo;

import java.util.List;

public interface InterfaceCarro<V extends Veiculo> {
    List<V> buscarCarro(String nome);
}
