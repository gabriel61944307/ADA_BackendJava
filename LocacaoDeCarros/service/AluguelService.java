package service;

import BancoDeDados.BD;
import dominio.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Set;

public class AluguelService implements Service<Aluguel<Cliente, Veiculo>>, InterfaceAluguel{
    static Integer proximoID = 0;
    PessoaFisicaService fisicaService = new PessoaFisicaService();
    PessoaJuridicaService juridicaService = new PessoaJuridicaService();
    CarroPequenoService pequenoService = new CarroPequenoService();
    CarroMedioService medioService = new CarroMedioService();
    CarroSUVService SUVService = new CarroSUVService();
    static  private final BD<String, Aluguel<Cliente, Veiculo>> bancoAluguel = new BD<>();

    @Override
    public void realizarAluguel(String CPF_CNPJ, String placa, String local, LocalDateTime momentoRetirada) {
        Cliente cliente = fisicaService.buscar(CPF_CNPJ);
        if(cliente == null){
            cliente = juridicaService.buscar(CPF_CNPJ);
        }
        if(cliente == null){
            System.out.println("Cliente não está no sistema.");
            return;
        }

        Veiculo veiculo = pequenoService.buscar(placa);
        if(veiculo == null) veiculo = medioService.buscar(placa);
        if(veiculo == null) veiculo = SUVService.buscar(placa);
        if(veiculo == null) {
            System.out.println("Carro não está no sistema.");
            return;
        }

        if(veiculo.isAlugado()){
            System.out.println("Veiculo alugado no momento.");
            return;
        }

        Aluguel<Cliente, Veiculo> aluguel = new Aluguel<>(cliente, veiculo, local, momentoRetirada);
        veiculo.setAlugado(true);
        cliente.addVeiculo(veiculo);
        this.salvar(aluguel);
    }

    @Override
    public void finalizarAluguel(String codigoAluguel, LocalDateTime dataDevolucao) {
        Aluguel<Cliente, Veiculo> aluguel = this.buscar(codigoAluguel);
        Double multiplicadorDesconto = 1d;
        if(aluguel == null){
            System.out.println("Código de aluguel inexistente.");
            return;
        }

        Cliente cliente = aluguel.getCliente();
        Veiculo veiculo = aluguel.getVeiculo();

        cliente.devolverVeiculo(veiculo);
        veiculo.setAlugado(false);
        aluguel.setMomentoDevolucao(dataDevolucao);

        Double dias = (Duration.between(aluguel.getMomentoRetirada(), aluguel.getMomentoDevolucao()).toHours() / 24.0);
        if(cliente instanceof PessoaJuridica && dias > 3) {
            multiplicadorDesconto = 0.90;
        }
        else if(cliente instanceof PessoaFisica && dias > 5) {
            multiplicadorDesconto = 0.95;
        }

        if(veiculo instanceof CarroPequeno){
            aluguel.setTotal(Math.ceil(dias) * CarroPequeno.precoDiaria * multiplicadorDesconto);
        } else if (veiculo instanceof CarroMedio) {
            aluguel.setTotal(Math.ceil(dias) * CarroMedio.precoDiaria * multiplicadorDesconto);
        } else if (veiculo instanceof CarroSUV) {
            aluguel.setTotal(Math.ceil(dias) * CarroSUV.precoDiaria * multiplicadorDesconto);
        }
    }

    @Override
    public void listar() {
        Set<String> chaves = bancoAluguel.getChaves();

        for(String chave : chaves){
            System.out.println(chave + " : " + bancoAluguel.buscar(chave));
        }
    }


    @Override
    public void salvar(Aluguel<Cliente, Veiculo> aluguel) {
        bancoAluguel.salvar(proximoID.toString(), aluguel);
        proximoID++;
    }

    @Override
    public Collection<Aluguel<Cliente, Veiculo>> buscarTodos() {
        return bancoAluguel.buscarTodos();
    }

    @Override
    public Aluguel<Cliente, Veiculo> buscar(String identificador) {
        return bancoAluguel.buscar(identificador);
    }

    @Override
    public void remover(String identificador) {
        bancoAluguel.remover(identificador);
    }

    @Override
    public void alterar(String identificador, Aluguel<Cliente, Veiculo> aluguel) {
        bancoAluguel.alterar(identificador, aluguel);
    }
}
