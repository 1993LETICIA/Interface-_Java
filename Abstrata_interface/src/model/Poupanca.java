
package model;


public class Poupanca implements Conta{
    private double saldo; 
    @Override
    public double saldo(){// se é abstrato não tem implementação
        return saldo;
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
