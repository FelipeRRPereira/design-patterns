package Strategy.Investimentos;

public class RealizadorDeInvestimentos {
    public void realizaCalculo(Conta conta, Investimento investimentoQualquer) {
        double investimento =  investimentoQualquer.calcula(conta);
        System.out.println(investimento);
    }
}
