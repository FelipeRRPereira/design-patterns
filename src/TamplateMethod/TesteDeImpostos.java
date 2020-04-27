package TamplateMethod;

import Strategy.*;

public class TesteDeImpostos {
    public static void main(String[] args) {
        Imposto icpp = new ICPP();
        Imposto ikcv = new IKCV();

        Orcamento orcamentoMenorQueMil = new Orcamento(500.00);
        Orcamento orcamentoMaiorIgualQueMilMenorIgualTresMil = new Orcamento(1500.00);
        Orcamento orcamentoMaiorQueTresMil = new Orcamento(3500.00);

        CalculadorDeImpostos calculador = new CalculadorDeImpostos();

        //calculador.realizaCalculo(orcamentoMenorQueMil, icpp);
        calculador.realizaCalculo(orcamentoMaiorIgualQueMilMenorIgualTresMil, ikcv);
    }
}
