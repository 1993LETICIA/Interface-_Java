package model;

public interface Conta {

    double LIMITE_PADRAO = 100; // DENTRO DE UMA INTERFACE TUDO É PÚBLICO

    double saldo();

    double sacar(double valor);

    double depositar(double valor);

    static String limitePadraoFormatado() {
        String valorFormatado = String.format("%.2f", LIMITE_PADRAO);
        return valorFormatado;
    }

    default String limiteFormatado() {
        return limitePadraoFormatado();
    }
    }
