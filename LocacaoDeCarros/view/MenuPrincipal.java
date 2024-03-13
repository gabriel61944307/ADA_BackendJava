package view;

import dominio.CarroMedio;
import dominio.CarroPequeno;
import dominio.CarroSUV;

public class MenuPrincipal {
    public void teste(){
        CarroPequeno pequeno = new CarroPequeno("100BR1LMS");
        CarroMedio medio = new CarroMedio("123aADA2CA");
        CarroSUV suv = new CarroSUV("1315dfafs321");

        System.out.println(CarroPequeno.precoDiaria);
        System.out.println(CarroMedio.precoDiaria);
        System.out.println(CarroSUV.precoDiaria);
    }
}
