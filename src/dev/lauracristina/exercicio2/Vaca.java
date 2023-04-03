package dev.lauracristina.exercicio2;

public class Vaca extends Animal {
    private String barulho2;


    public Vaca(String nome, String barulho2) {
        super(nome);
        this.barulho2 = barulho2;
    }

    @Override
    public void emitirSom() {
        System.out.println("o animal " + super.getNome() + " e meu barulho é " + barulho2);
    }
}
