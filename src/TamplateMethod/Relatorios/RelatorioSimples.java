package TamplateMethod.Relatorios;

import Strategy.Investimentos.Conta;

import java.util.List;

class RelatorioSimples extends Relatorio {
    protected void cabecalho() {
        System.out.println("Banco Template");
    }

    protected void rodape() {
        System.out.println("(51) 9999-9999");
    }

    protected void corpo(List<Conta> contas) {
        for(Conta conta : contas) {
            System.out.println( conta.getNome() + " - " + conta.getSaldo() );
        }
    }
}
