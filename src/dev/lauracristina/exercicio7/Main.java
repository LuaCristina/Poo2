package dev.lauracristina.exercicio7;

public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Circulo("circulo", 4.2);
        Figura figura2 = new Triangulo("triangulo", 5, 6);
        Figura figura3 = new Triangulo("retangulo", 4, 7);


        figura1.calcularArea();
        figura2.calcularArea();
        figura3.calcularArea();

    }
}
