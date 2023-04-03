package dev.lauracristina.exercicio2;

public class Cachorro extends Animal {
    private String barulho;

    public Cachorro(String nome, String barulho) {
        super(nome);
        this.barulho = barulho;
    }
    @Override
    public void emitirSom() {
        System.out.println("o animal " + super.getNome() + " e meu barulho é " + barulho);
    }
}