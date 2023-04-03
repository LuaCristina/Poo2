package dev.lauracristina.exercicio1;

public class Funcionario extends Pessoa {
    private String funcao;

    public Funcionario(String nome, String funcao) {
        super(nome);
        this.funcao = funcao;
    }

    @Override
    public void apresentar() {
        System.out.println("Meu nome é " + super.getNome() + " e minha função é " + funcao);
    }
}