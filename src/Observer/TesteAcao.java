package Observer;

import Builder.ItemDaNota;
import Builder.NotaFiscal;
import Builder.NotaFiscalBuilder;

import java.util.ArrayList;
import java.util.List;

public class TesteAcao {
    public static void main(String[] args) {
        List<AcaoAposGerarNota> todasAcoesASeremExecutadas = new ArrayList<>();
        todasAcoesASeremExecutadas.add(new EnviadorDeEmail());
        todasAcoesASeremExecutadas.add(new NotaFiscalDao());
        todasAcoesASeremExecutadas.add(new EnviadorDeSms());
        todasAcoesASeremExecutadas.add(new Impressora());
        todasAcoesASeremExecutadas.add(new Multiplicador(10));

        NotaFiscalBuilder builder = new NotaFiscalBuilder(todasAcoesASeremExecutadas);

        NotaFiscal notaFiscal = builder.paraEmpresa("Felipe Pereira")
                .comCnpj("123.456.789/0001-10")
                .comItem(new ItemDaNota("item 1", 100.0))
                .comItem(new ItemDaNota("item 2", 200.0))
                .comItem(new ItemDaNota("item 3", 300.0))
                .comObservacoes("entregar notaFiscal pessoalmente")
                .constroi();

        System.out.println(notaFiscal.getValorBruto());
    }
}
