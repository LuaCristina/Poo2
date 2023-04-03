package dev.lauracristina.exercicio8;

public class Notebook extends Computador{

    public Notebook (String tipo){
        super(tipo);
    }

    @Override
    public void iniciar(){
        System.out.println("o " + getTipo() + " está iniciando");
    }
}
