package ChainOfResponsibility.AplicacaoBancaria;

public class Conta {
    private final String titular;
    private final double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}
