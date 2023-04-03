package dev.lauracristina.exercicio1;

import dev.lauracristina.exercicio1.Pessoa;

public class Professor extends Pessoa {
    private String area;

    public Professor(String nome, String area) {
        super(nome);
        this.area = area;
    }
    @Override
    public void apresentar() {
        System.out.println("Meu nome é " + super.getNome() + " e minha área de formação é " + area);
    }
}
