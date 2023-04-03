package dev.lauracristina.exercicio10;

public class Mamifero extends Animal {

    public Mamifero(String nome){
        super(nome);
    }

    public void amamentar(){
        System.out.println("o animal " + getNome() + " esta amamentando seus filhotes");
    }
}
