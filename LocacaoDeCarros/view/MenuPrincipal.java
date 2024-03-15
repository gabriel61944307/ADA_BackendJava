package view;

import dominio.*;
import service.PessoaJuridicaService;
import service.Service;
import service.PessoaFisicaService;

import java.util.Collection;

public class MenuPrincipal {
    public void teste(){
        Service<PessoaFisica> pessoaFisicaService = new PessoaFisicaService();
        PessoaFisica cliente = new PessoaFisica("Gabriel", "123456789");
        PessoaFisica cliente1 = new PessoaFisica("Lucas", "5612");
        PessoaFisica cliente2 = new PessoaFisica("Jabulani", "654987");
        pessoaFisicaService.salvar(cliente);
        pessoaFisicaService.salvar(cliente1);
        pessoaFisicaService.salvar(cliente2);

        Collection<PessoaFisica> listaClientesFisicos = pessoaFisicaService.buscarTodos();
        for(PessoaFisica item : listaClientesFisicos){
            System.out.println(item.getNome() + " : " + item.getCpf());
        }

        System.out.println(pessoaFisicaService.buscar("123456789").getNome() + " : " +
                pessoaFisicaService.buscar("123456789").getCpf());

        cliente.setNome("AGORA É LUCAS");
        pessoaFisicaService.alterar("123456789", cliente);

        System.out.println(pessoaFisicaService.buscar("123456789").getNome() + " : " +
                pessoaFisicaService.buscar("123456789").getCpf());

        pessoaFisicaService.remover("123456789");

        listaClientesFisicos = pessoaFisicaService.buscarTodos();
        for(PessoaFisica item : listaClientesFisicos){
            System.out.println(item.getNome() + " : " + item.getCpf());
        }

        System.out.println("--------------------------------------");
        Service<PessoaJuridica> pessoaJuridicaService = new PessoaJuridicaService();
        PessoaJuridica pessoa = new PessoaJuridica("nestle", "12345b.155.45-0");
        PessoaJuridica pessoa1 = new PessoaJuridica("petrobras", "0165sa,02sa3d");
        PessoaJuridica pessoa2 = new PessoaJuridica("carrefour", "241-a1d66a-.da");

        pessoaJuridicaService.salvar(pessoa);
        pessoaJuridicaService.salvar(pessoa1);
        pessoaJuridicaService.salvar(pessoa2);

        Collection<PessoaJuridica> listaClienteJuridicos = pessoaJuridicaService.buscarTodos();
        for(PessoaJuridica item: listaClienteJuridicos){
            System.out.println(item.getNome() + " : " + item.getCnpj());
        }

        System.out.println(pessoaJuridicaService.buscar("12345b.155.45-0").getNome() + " : " +
                pessoaJuridicaService.buscar("12345b.155.45-0").getCnpj());

        pessoaJuridicaService.alterar("12345b.155.45-0", pessoa2);

        for(PessoaJuridica item: listaClienteJuridicos){
            System.out.println(item.getNome() + " : " + item.getCnpj());
        }

        System.out.println("--------------------------------------");
    }
}
