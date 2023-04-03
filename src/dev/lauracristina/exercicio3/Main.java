package dev.lauracristina.exercicio3;

import dev.lauracristina.exercicio3.Carro;
import dev.lauracristina.exercicio3.Moto;
import dev.lauracristina.exercicio3.Caminhao;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Carro("carro", "34km/h");
        Veiculo veiculo2 = new Moto("moto", "24km/h");
        Veiculo veiculo3 = new Caminhao("caminhao", "67km/h");

        veiculo1.acelerar();
        veiculo2.acelerar();
        veiculo3.acelerar();
    }
}
