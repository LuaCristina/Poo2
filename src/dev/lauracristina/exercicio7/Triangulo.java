package dev.lauracristina.exercicio7;

public class Triangulo extends Figura {
    private int base, altura;

    public Triangulo (String nome, int base, int altura){
        super(nome);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void calcularArea() {
        System.out.println("a figura é um " + getNome() + " com área de " + (( base * altura)/2) + "cm");

    }

}
