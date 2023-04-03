package dev.lauracristina.exercicio10;

public class Galinha extends Animal{
    private int racao;

    public Galinha (String nome, int racao){
        super(nome);
        this.racao = racao;
    }


    @Override
    public void comer(){
        System.out.println("o animal " + getNome() + " esta comendo " + racao + "kg de raçao");
    }

}
