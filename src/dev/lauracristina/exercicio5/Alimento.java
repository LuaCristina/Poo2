package dev.lauracristina.exercicio5;

public class Alimento extends Produto{
    private String categoria1;

    public Alimento(String categoria, String desconto) {
        super(categoria, desconto);
    }

    public void calcularDesconto() {
        System.out.println("produto da categoria" +super.getCategoria() + " com desconto de  " + super.getDesconto() + "%") ;
    }


}
