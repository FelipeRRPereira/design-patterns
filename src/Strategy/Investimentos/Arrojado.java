package Strategy.Investimentos;

public class Arrojado implements Investimento {
    @Override
    public double calcula(Conta conta) {
        double chances = new java.util.Random().nextDouble();
        if (chances <= 0.20) {
            return conta.getSaldo() + ((conta.getSaldo() * 0.05) * 0.75);
        }
        else if (chances > 0.20 || chances <= 0.30) {
            return conta.getSaldo() + ((conta.getSaldo() * 0.03) * 0.75);
        }
        return conta.getSaldo() + ((conta.getSaldo() * 0.006) * 0.75);
    }
}
