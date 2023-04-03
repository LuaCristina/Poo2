package dev.lauracristina.exercicio10;

public class Cachorro extends Mamifero {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void amamentar() {
        super.amamentar();
    }
    public void comer() {
        System.out.println("o animal " + getNome() + " esta comendo ");
    }
}
