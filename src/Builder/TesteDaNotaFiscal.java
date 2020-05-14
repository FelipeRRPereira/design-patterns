package Builder;

public class TesteDaNotaFiscal {
    public static void main(String[] args) {
        ItemDaNota item1 = new ItemDaNotaBuilder().comNome("Item 1").comValor(300.0).controi();
        ItemDaNota item2 = new ItemDaNotaBuilder().comNome("Item 2").comValor(600.0).controi();
        ItemDaNota item3 = new ItemDaNotaBuilder().comNome("Item 3").comValor(700.0).controi();

        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.paraEmpresa("Barnabes")
        .comCnpj("10.212.344/0032-44")
        .comItem(item1)
        .comItem(item2)
        .comItem(item3)
        .comObservacoes("qualquer obs");

        NotaFiscal nf = builder.constroi();

        System.out.println(nf.getValorBruto());
    }
}
