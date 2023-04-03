package dev.lauracristina.exercicio8;

public class Main {
    public static void main(String[] args) {

        Computador computador = new Notebook("notebook");
        Computador computador1 = new Servidor("servidor");
        Computador computador2 = new Desktop("desktop");

        computador.iniciar();
        computador1.iniciar();
        computador2.iniciar();

    }

}
