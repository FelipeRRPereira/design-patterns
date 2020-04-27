package TamplateMethod;

import Strategy.Orcamento;
import Strategy.Imposto;

public abstract  class TamplateDeImpostoCondicional implements Imposto {

    @Override
    public final double calcula(Orcamento orcamento) {

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
