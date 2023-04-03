package dev.lauracristina.exercicio8;

public class Desktop extends Computador{

    public Desktop (String tipo){
        super(tipo);
    }

    @Override
    public void iniciar(){
        System.out.println("o " + getTipo() + " está iniciando");
    }
}
