package dev.lauracristina.exercicio3;

public class Caminhao extends Veiculo {
    private String veiculo3;


    public Caminhao(String nome, String veiculo3) {
        super(nome);
        this.veiculo3 = veiculo3;
    }

    @Override
    public void acelerar() {
        System.out.println("o veiculo é " + super.getNome() + " e a velocidade é " + veiculo3);
    }};

