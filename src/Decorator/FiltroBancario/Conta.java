package Decorator.FiltroBancario;


import java.util.Calendar;

public class Conta {
    private final String titular;
    private final double saldo;
    private final Calendar dataAbertura;

    public Conta(String titular, double saldo, Calendar dataAbertura) {
        this.titular = titular;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public Calendar getDataAbertura() {
        return dataAbertura;
    }
}
