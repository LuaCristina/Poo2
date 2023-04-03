package dev.lauracristina.exercicio4;



public class Assistente extends Funcionario {
    private String funcionario1;


    public Assistente(String nome, String idade, Double salario) {
        super(nome, idade, salario);
    }

    @Override
    public void calcularSalario() {
        System.out.println("meu nome é " + super.getNome() + " tenho " + super.getIdade() + " anos e meu salário é " + super.getSalario());
    }
}

