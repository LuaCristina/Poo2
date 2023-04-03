package dev.lauracristina.exercicio5;

public class Eletronico extends Produto{


    public Eletronico(String categoria, String desconto) {
        super(categoria, desconto);
    }

    public void calcularDesconto() {
        System.out.println("produto da categoria" +super.getCategoria() + " com desconto de  " + super.getDesconto() + "%") ;
    }


}