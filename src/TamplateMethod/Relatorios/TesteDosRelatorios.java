package TamplateMethod.Relatorios;

import Strategy.Investimentos.Conta;

import java.util.ArrayList;
import java.util.List;

public class TesteDosRelatorios {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        Conta conta = new Conta("Felipe", 1, 1, 3000.00 );
        Conta conta2 = new Conta("Carla", 2, 2, 3500.00 );
        Conta conta3 = new Conta("João", 3, 3, 3060.00 );

        contas.add(conta);
        contas.add(conta2);
        contas.add(conta3);

        RelatorioSimples relatorioSimples = new RelatorioSimples();
        RelatorioComplexo relatorioComplexo = new RelatorioComplexo();

        relatorioSimples.imprime(contas);
        System.out.println("-------------------------------------------------");
        relatorioComplexo.imprime(contas);
    }
}
