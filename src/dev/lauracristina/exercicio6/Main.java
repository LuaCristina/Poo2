package dev.lauracristina.exercicio6;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente("corrente", "56", "1000" );
        Conta conta2 = new ContaPoupanca("poupança", "latifa santos", "3726" );

        conta1.verificarConta();
        conta2.verificarConta();


    }



}
