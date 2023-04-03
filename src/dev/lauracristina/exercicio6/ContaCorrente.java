package dev.lauracristina.exercicio6;

public class ContaCorrente extends Conta{
    private String taxaDeManutençao, limiteDeSaque;

    public ContaCorrente (String tipo, String taxaDeManutençao, String limiteDeSaque){
        super(tipo);
        this.limiteDeSaque = limiteDeSaque;
        this.taxaDeManutençao = taxaDeManutençao;
    }

    @Override
    public void verificarConta(){
        System.out.println("tipo de conta " + getTipo() + " com limite de saque " + limiteDeSaque + " reais e taxa de manutençao a " + taxaDeManutençao + "%"  );
    }
}
