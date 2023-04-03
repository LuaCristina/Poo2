package dev.lauracristina.exercicio6;

public class ContaPoupanca extends Conta  {
    private String titular, agencia;

    public ContaPoupanca (String tipo, String titular, String agencia){
        super(tipo);
        this.agencia = agencia;
        this.titular = titular;
    }

    @Override
    public void verificarConta(){
        System.out.println("tipo de conta " + getTipo() + " com o titular " + titular + " e agência " + agencia);
    }
}


