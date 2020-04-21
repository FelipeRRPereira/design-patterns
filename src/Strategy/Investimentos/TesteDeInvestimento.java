package Strategy.Investimentos;

public class TesteDeInvestimento {
    public static void main(String[] args) {
        Investimento conservador = new Conservador();
        Investimento moderado = new Moderado();
        Investimento arrojado = new Arrojado();

        Conta contaConservador = new Conta(100);
        Conta contaModerado = new Conta(100);
        Conta contaArrojado = new Conta(100);

        RealizadorDeInvestimentos realizador = new RealizadorDeInvestimentos();

        realizador.realizaCalculo(contaConservador, conservador);
        realizador.realizaCalculo(contaModerado, moderado);
        realizador.realizaCalculo(contaArrojado, arrojado);
    }
}
