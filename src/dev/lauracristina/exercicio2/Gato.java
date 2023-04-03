package dev.lauracristina.exercicio2;

public class Gato extends Animal {
    private String barulho1;

    public Gato(String nome, String barulho1) {
        super(nome);
        this.barulho1 = barulho1;
    }

    @Override
    public void emitirSom() {
        System.out.println("o animal " + super.getNome() + " e meu barulho é " + barulho1);
    }
}