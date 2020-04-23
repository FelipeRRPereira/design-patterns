package ChainOfResponsibility.AplicacaoBancaria;

public class RespostaSemFormato implements Resposta {
    @Override
    public void responde(Requisicao req, Conta conta) {
        System.out.println(conta.getTitular());
        System.out.println(conta.getSaldo());
    }

    @Override
    public void setProxima(Resposta resposta) {

    }
}
