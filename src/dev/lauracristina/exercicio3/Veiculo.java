package dev.lauracristina.exercicio3;

public class Veiculo {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Veiculo(String nome) {
        this.nome = nome;
    }

    public void acelerar() {
        System.out.println("esse é o veículo " + nome);
    }
}
