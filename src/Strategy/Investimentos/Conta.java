package Strategy.Investimentos;

public class Conta {

    private String nome;
    private int numero;
    private int agencia;
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public Conta(String nome, int numero, int agencia, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }
}
