package dev.lauracristina.exercicio7;


public class Circulo extends Figura {
    private double raio;

    public Circulo (String nome, double raio){
        super(nome);
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        System.out.println("a figura é um " + getNome() + " com área de " + ( Math.PI * Math.pow(raio, 2)) + "cm");

    }

}
