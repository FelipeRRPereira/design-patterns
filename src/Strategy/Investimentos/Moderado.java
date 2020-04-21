package Strategy.Investimentos;

public class Moderado implements Investimento {
    @Override
    public double calcula(Conta conta) {
        boolean escolhido = new java.util.Random().nextDouble() > 0.50;
        if (escolhido) {
            return conta.getSaldo() + ((conta.getSaldo() * 0.025) * 0.75);
        }
        return conta.getSaldo() + ((conta.getSaldo() * 0.007) * 0.75);
    }
}
