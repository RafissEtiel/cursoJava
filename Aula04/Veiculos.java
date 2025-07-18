package Aula04;

import java.util.Scanner;

public class Veiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro novoCarro = new Carro();
        moto novamoto = new moto();


        novoCarro.cor = "Preta";
        novoCarro.modelo = "TRACKER";
        novoCarro.ano = Integer.parseInt("2022");

        novamoto.corDaMoto = "Azul Royal";
        novamoto.modeloDaMoto = "TRIUMPH TIGER EXPLORER XC ABS";
        novamoto.anoDaMoto = Integer.parseInt("2016");

        System.out.println("\n");

        novoCarro.ligar();
        novoCarro.abastecer();

        System.out.println("\n");

        novamoto.ligar();
        novamoto.abastecer();



    }

    }