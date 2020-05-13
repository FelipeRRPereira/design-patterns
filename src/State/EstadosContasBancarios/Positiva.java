package State.EstadosContasBancarios;

public class Positiva implements EstadoContaBancaria {

    @Override
    public void operacaoSaque(Conta conta, double valor) {
        conta.saldo -= valor;

        if(conta.saldo < 0) conta.estadoAtual = new Negativa();
    }

    @Override
    public void operacaoDeposito(Conta conta, double valor) {
        conta.saldo += valor * 0.98;
    }
}
