package ChainOfResponsibility.AplicacaoBancaria;

public class RespostaFormatoPerCento implements Resposta{
    private Resposta resposta;

    public RespostaFormatoPerCento(Resposta resposta) {
        this.resposta = resposta;
    }

    @Override
    public void responde(Requisicao req, Conta conta) {
        if (req.getFormato() == Formato.PORCENTO) {
            System.out.println("%titular%saldo%");
            System.out.println("%" + conta.getTitular() + "%" + conta.getSaldo() + "%");
        } else {
            this.resposta.responde(req, conta);
        }
    }

    @Override
    public void setProxima(Resposta resposta) {
        this.resposta = resposta;
    }
}
