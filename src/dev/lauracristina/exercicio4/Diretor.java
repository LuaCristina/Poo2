package dev.lauracristina.exercicio4;

public class Diretor extends Funcionario {
    private String funcionario3;


    public Diretor(String nome, String idade, Double salario) {
        super(nome, idade, salario);
    }

    @Override
    public void calcularSalario() {
        System.out.println("meu nome é " + super.getNome() + " tenho " + super.getIdade() + " anos e meu salário é " + super.getSalario());
    }
}