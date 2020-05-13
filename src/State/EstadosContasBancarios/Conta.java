package State.EstadosContasBancarios;

import java.util.Calendar;

public class Conta {
    private final String titular;
    protected double saldo;
    protected EstadoContaBancaria estadoAtual;

    public Conta(String titular, double saldo, Calendar dataAbertura) {
        this.titular = titular;
        this.saldo = saldo;
        if (saldo > 0)
            this.estadoAtual = new Positiva();
        else
            this.estadoAtual = new Negativa();
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void operacaoSaque(double valor) {
        estadoAtual.operacaoSaque(this, valor);
    }

    public void operacaoDeposito(double valor) {
        estadoAtual.operacaoDeposito(this, valor);
    }
}
