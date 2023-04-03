package dev.lauracristina.exercicio5;


import dev.lauracristina.exercicio5.Eletronico;
import dev.lauracristina.exercicio5.Vestuario;
import dev.lauracristina.exercicio5.Alimento;
import dev.lauracristina.exercicio5.Produto;


public class Main {
    public static void main(String[] args) {
        Produto categoria1 = new Alimento("laura", "23");
        Produto categoria2 = new Eletronico("marcos", "45");
        Produto categoria3 = new Vestuario("amanda", "32");

        categoria1.calcularDesconto();
        categoria2.calcularDesconto();
        categoria3.calcularDesconto();
    }
}

