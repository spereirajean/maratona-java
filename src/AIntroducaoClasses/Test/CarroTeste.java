package AIntroducaoClasses.Test;

import AIntroducaoClasses.Carro;

public class CarroTeste {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "BMW";
        carro1.modelo = "310i";
        carro1.ano = 2022;

        carro2.nome = "Fiat";
        carro2.modelo = "Argo";
        carro2.ano = 2025;


        System.out.println("Carro: "+carro1.nome+"\nModelo: "+ carro1.modelo+"\nAno: "+carro1.ano);
        System.out.println("Carro: "+carro2.nome+"\nModelo: "+ carro2.modelo+"\nAno: "+carro2.ano);
    }
}