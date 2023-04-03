package dev.lauracristina.exercicio5;

public class Produto {

    private String categoria;
    private String desconto ;

    public Produto(String categoria, String desconto) {
        this.categoria = categoria;
        this.desconto = desconto;
    }

    public String getDesconto() {
        return desconto;
    }

    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public void calcularDesconto() {
        System.out.println("produto da categoria" + categoria + " com desconto de  " + desconto) ;
    }
}
