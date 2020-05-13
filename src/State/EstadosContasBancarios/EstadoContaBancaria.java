package State.EstadosContasBancarios;

public interface EstadoContaBancaria {
    void operacaoSaque(Conta conta, double valor);
    void operacaoDeposito(Conta conta, double valor);
}
