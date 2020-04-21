package Strategy;

public class TesteDeImpostos {
    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto icms = new ICMS();
        Imposto iccc = new ICCC();

        Orcamento orcamentoMenorQueMil = new Orcamento(500.00);
        Orcamento orcamentoMaiorIgualQueMilMenorIgualTresMil = new Orcamento(1500.00);
        Orcamento orcamentoMaiorQueTresMil = new Orcamento(3500.00);

        CalculadorDeImpostos calculador = new CalculadorDeImpostos();

        // calculador.realizaCalculo(orcamento, iss);
        // calculador.realizaCalculo(orcamento, icms);
        calculador.realizaCalculo(orcamentoMenorQueMil, iccc);
        calculador.realizaCalculo(orcamentoMaiorIgualQueMilMenorIgualTresMil, iccc);
        calculador.realizaCalculo(orcamentoMaiorQueTresMil, iccc);
    }
}
