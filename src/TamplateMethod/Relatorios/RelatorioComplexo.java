package TamplateMethod.Relatorios;

import Strategy.Investimentos.Conta;

import java.util.Calendar;
import java.util.List;

class RelatorioComplexo extends Relatorio {
    protected void cabecalho() {
        System.out.println("Banco Template");
        System.out.println("Av. 20 Setembro, 1234");
        System.out.println("(51) 9999-9999");
    }

    protected void rodape() {
        System.out.println("banco@template.com.br");
        System.out.println(Calendar.getInstance().getTime());
    }

    protected void corpo(List<Conta> contas) {
        for(Conta conta : contas) {
            System.out.println( conta.getNome() + " - " + conta.getNumero() + " - " + conta.getAgencia() + " - " + conta.getSaldo() );
        }
    }
}
