package dev.lauracristina.exercicio8;

public class Servidor extends Computador{

    public Servidor (String tipo){
        super(tipo);
    }

    @Override
    public void iniciar(){
        System.out.println("o " + getTipo() + " está iniciando");
    }
}

