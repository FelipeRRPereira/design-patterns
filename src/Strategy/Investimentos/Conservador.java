package Strategy.Investimentos;

public class Conservador implements Investimento {
    @Override
    public double calcula(Conta conta) {
        return conta.getSaldo() + ((conta.getSaldo() * 0.008) * 0.75);
    }
}
