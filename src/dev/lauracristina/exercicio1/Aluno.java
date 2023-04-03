package dev.lauracristina.exercicio1;

public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    @Override
    public void apresentar() {
        System.out.println("Meu nome é " + super.getNome() + " e eu estou matriculado no curso de " + curso);
    }
}