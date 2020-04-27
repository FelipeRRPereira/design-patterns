package ChainOfResponsibility;

import Strategy.Orcamento;

public interface Desconto {
    double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
