package dev.lauracristina.exercicio9;

public class Circulo extends Forma{
    private double raio;

    public Circulo(String nome, double raio){
        super(nome);
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        double area = ( Math.PI * Math.pow(raio, 2));
        System.out.println("a área do " + getNome() + " é " + + area);
        return area;
    }
}
