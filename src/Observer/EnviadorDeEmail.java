package Observer;

import Builder.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota{
    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("enviando por e-mail");
    }
}
