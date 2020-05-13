package Decorator;


import Strategy.Orcamento;

public class ICPP extends TamplateDeImpostoCondicional {

    public ICPP(Imposto outroImposto) {
        super(outroImposto);
    }

    public ICPP() {
        super();
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

}