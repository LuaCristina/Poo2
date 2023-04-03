package dev.lauracristina.exercicio1;

public class Pessoa {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void apresentar() {
        System.out.println("[P] Meu nome é " + nome);
    }
}






