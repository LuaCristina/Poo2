package dev.lauracristina.exercicio6;

public class Conta {
    private String tipo;

    public Conta(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void verificarConta(){
        System.out.println("tipo de conta " + getTipo() );
    }

}
