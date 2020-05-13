package State.EstadosContasBancarios;

public class Negativa implements EstadoContaBancaria {

    @Override
    public void operacaoSaque(Conta conta, double valor) {
        throw new RuntimeException("Conta negativada não pode efetuar saque!");
    }

    @Override
    public void operacaoDeposito(Conta conta, double valor) {
        conta.saldo += valor * 0.95;
        if(conta.saldo > 0) conta.estadoAtual = new Positiva();
    }
}
