package dev.lauracristina.exercicio4;

import dev.lauracristina.exercicio4.Diretor;
import dev.lauracristina.exercicio4.Gerente;
import dev.lauracristina.exercicio4.Assistente;
import dev.lauracristina.exercicio4.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Assistente("laura", "23", 2345.00);
        Funcionario funcionario2 = new Gerente("marcos", "45", 2345.00);
        Funcionario funcionario3 = new Diretor("amanda", "32", 2345.00);

        funcionario1.calcularSalario();
        funcionario2.calcularSalario();
        funcionario3.calcularSalario();
    }
}
