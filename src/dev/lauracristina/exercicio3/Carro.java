package dev.lauracristina.exercicio3;

import dev.lauracristina.exercicio2.Animal;

public class Carro extends Veiculo {
    private String veiculo1;


    public Carro(String nome, String veiculo1) {
        super(nome);
        this.veiculo1 = veiculo1;
    }

    @Override
    public void acelerar() {
        System.out.println("o veiculo é " + super.getNome() + " e a velocidade é " + veiculo1);
    }
}
