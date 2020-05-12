package Decorator;

import Strategy.Orcamento;

public abstract  class TamplateDeImpostoCondicional extends Imposto {

    public TamplateDeImpostoCondicional(Imposto outroImposto) {
        super(outroImposto);
    }

    public TamplateDeImpostoCondicional() {
        super();
    }

    @Override
    public double calcula(Orcamento orcamento) {
        if(deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }
    }

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
    public abstract double maximaTaxacao(Orcamento orcamento);
    public abstract double minimaTaxacao(Orcamento orcamento);

}
