package Decorator;

import Strategy.Orcamento;

public class TesteDeImpostosCompostos {

    public static void main(String[] args) {
        Imposto impostos = new IKCV(new ICPP());

        Orcamento orcamento = new Orcamento(3000.0);

        System.out.println(
                impostos.calcula(orcamento)
        );
    }

}
