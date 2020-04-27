package TamplateMethod;

import ChainOfResponsibility.Item;
import Strategy.Orcamento;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TamplateDeImpostoCondicional {

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        List<String> noOrcamento = new ArrayList<String>();
        for (Item item: orcamento.getItens()) {
            if (noOrcamento.contains(item.getNome())) return true;
            else return noOrcamento.add(item.getNome());
        }
        return false;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.13 + 100;
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * (0.01 * orcamento.getItens().size());
    }
}
