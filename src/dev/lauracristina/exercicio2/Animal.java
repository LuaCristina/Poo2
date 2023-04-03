package dev.lauracristina.exercicio2;

public class Animal {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("Meu barulho é " + nome);
    }
}
