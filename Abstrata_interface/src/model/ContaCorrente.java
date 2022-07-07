package model;

public class ContaCorrente implements Conta {

    private double saldo;
    private double limite;

    @Override
    public double saldo() {
        return saldo;
    }

   
    public double limite() {
        return limite;
    }
      @Override
    public double sacar(double valor) {
        
        saldo = saldo - valor;
        return saldo;
    }
    @Override
    public double depositar(double valor){
        saldo = saldo + valor;
        return saldo;
    }

}
