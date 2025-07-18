package Aula04;

public class Carro {
    String cor;
    String modelo;
    int ano;

    void ligar() {
        System.out.println("O carro " + modelo + " está ligado.");
    }

    void abastecer() {
        System.out.println("O " + modelo + " da cor " + cor + " está abastecido!");
    }
}