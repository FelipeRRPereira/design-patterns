package ChainOfResponsibility.AplicacaoBancaria;

public class TestaRespostas {
    public static void main(String[] args) {
        ControladorDeRespostas controlador = new ControladorDeRespostas();

        Conta conta = new Conta("Felipe Pereira", 200000);

        Requisicao requisicaoXML = new Requisicao(Formato.XML);
        Requisicao requisicaoPORCENTO = new Requisicao(Formato.PORCENTO);
        Requisicao requisicaoCSV = new Requisicao(Formato.CSV);

        controlador.requisicao(requisicaoPORCENTO, conta);

    }
}
