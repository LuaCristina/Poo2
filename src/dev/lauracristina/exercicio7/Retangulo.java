package dev.lauracristina.exercicio7;

public class Retangulo extends Figura {
    private int base, altura;

    public Retangulo (String nome, int base, int altura){
        super(nome);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void calcularArea() {
        System.out.println("a figura é um " + getNome() + " com área de " + (base * altura) + "cm");

    }

}