package dev.lauracristina.exercicio2;

import dev.lauracristina.exercicio2.Vaca;
import dev.lauracristina.exercicio2.Cachorro;
import dev.lauracristina.exercicio2.Gato;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Vaca("vaca", "muuuu");
        Animal animal2 = new Gato("gato", "miau");
        Animal animal3 = new Cachorro("Cachorro", "auau");

        animal1.emitirSom();
        animal2.emitirSom();
        animal3.emitirSom();
    }
}
