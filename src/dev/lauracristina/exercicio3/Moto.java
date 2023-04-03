package dev.lauracristina.exercicio3;

public class Moto extends Veiculo {
    private String veiculo2;


    public Moto(String nome, String veiculo2) {
        super(nome);
        this.veiculo2 = veiculo2;
    }

    @Override
    public void acelerar() {
        System.out.println("o veiculo é " + super.getNome() + " e a velocidade é " + veiculo2);
    }
}
