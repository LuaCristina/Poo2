package dev.lauracristina.exercicio10;

public class Gato extends Mamifero {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void amamentar() {
        super.amamentar();
    }

    @Override
    public void comer() {
        System.out.println("o animal " + getNome() + " esta comendo ");
    }

}