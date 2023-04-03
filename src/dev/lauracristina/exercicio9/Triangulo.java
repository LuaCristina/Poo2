package dev.lauracristina.exercicio9;

public class Triangulo extends Forma {
    private double base;
    private double altura;

    public Triangulo(String nome, double base, double altura) {
        super(nome);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea(){
        double area =  ((base*altura)/2);
        System.out.println("a área do " + getNome() + " é " + area );
        return area;
    }
}
