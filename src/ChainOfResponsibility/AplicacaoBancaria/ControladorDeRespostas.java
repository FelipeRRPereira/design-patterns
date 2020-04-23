package ChainOfResponsibility.AplicacaoBancaria;

public class ControladorDeRespostas {
    public void requisicao(Requisicao req, Conta conta) {
        Resposta requests =
                new RespostaFormatoXML(
                        new RespostaFormatoPerCento(
                                new RespostaFormadoCSV()));

        requests.responde(req, conta);
    }
}
