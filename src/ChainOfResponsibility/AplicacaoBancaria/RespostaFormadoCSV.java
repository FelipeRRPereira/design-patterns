package ChainOfResponsibility.AplicacaoBancaria;

public class RespostaFormadoCSV implements Resposta{
    private Resposta resposta;

    public RespostaFormadoCSV(Resposta resposta) {
        this.resposta = resposta;
    }

    public RespostaFormadoCSV() {
        this.resposta = null;
    }

    @Override
    public void responde(Requisicao req, Conta conta) {
        if (req.getFormato() == Formato.CSV) {
            System.out.println("titular;saldo;");
            System.out.println(conta.getTitular() + ";" + conta.getSaldo() + ";");
        } else {
            this.resposta.responde(req, conta);
        }
    }

    @Override
    public void setProxima(Resposta resposta) {
        this.resposta = resposta;
    }
}
