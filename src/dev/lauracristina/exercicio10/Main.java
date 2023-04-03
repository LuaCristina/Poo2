package dev.lauracristina.exercicio10;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("cachorro");
        Gato gato = new Gato("gato");
        Vaca vaca = new Vaca("vaca");
        Galinha galinha = new Galinha("galinha", 89);

        Animal[] animais = {cachorro, gato, vaca, galinha};

        Fazenda fazenda = new Fazenda();
        fazenda.alimentarAnimais(animais);
    }
}
