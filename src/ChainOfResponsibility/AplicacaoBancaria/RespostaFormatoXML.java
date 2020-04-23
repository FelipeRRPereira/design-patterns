package ChainOfResponsibility.AplicacaoBancaria;

public class RespostaFormatoXML implements Resposta {
    private Resposta resposta;

    public RespostaFormatoXML(Resposta resposta) {
        this.resposta = resposta;
    }

    @Override
    public void responde(Requisicao req, Conta conta) {
        if (req.getFormato() == Formato.XML) {
            System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>");
        } else {
            this.resposta.responde(req, conta);
        }
    }

    @Override
    public void setProxima(Resposta resposta) {
        this.resposta = resposta;
    }
}
