package dev.lauracristina.exercicio9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Forma circulo = new Circulo("circulo", 6.0);
        Forma circulo1 = new Circulo("circulo", 4.0);
        Forma quadrado = new Quadrado("quadrado", 5, 10);
        Forma triangulo = new Triangulo("triangulo", 4, 10);
        Forma triangulo1 = new Triangulo("triangulo", 10, 12);


        List<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(circulo1);
        formas.add(quadrado);
        formas.add(triangulo);
        formas.add(triangulo1);


        CalculadoraDeAreas calculadoraDeAreas = new CalculadoraDeAreas();
        double somaAreas = calculadoraDeAreas.somarAreas(formas);

        System.out.println("a soma das areas é "+ somaAreas);

    }
}
