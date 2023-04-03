package dev.lauracristina.exercicio4;

public class Funcionario {

    private String nome, idade;
    private Double salario;

//construtor
    public Funcionario(String nome, String idade, Double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    //get & set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }


        public void calcularSalario() {
            System.out.println("meu nome é" + nome + " tenho " + idade + " anos e meu salário é " + salario) ;
        }


}
