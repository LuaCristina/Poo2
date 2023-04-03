package dev.lauracristina.exercicio9;

public class Quadrado extends Forma {
    private double base;
    private double altura;

    public Quadrado(String nome, double base, double altura) {
        super(nome);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea(){
        double area =  (base*altura);
        System.out.println("a área do " + getNome() + " é " + area);
        return area;
    }
}
