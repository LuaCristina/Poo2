package dev.lauracristina.exercicio8;

public class Computador {

    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Computador (String tipo){
        this.tipo = tipo;
    }

    public void iniciar(){
        System.out.println();
    }

}
