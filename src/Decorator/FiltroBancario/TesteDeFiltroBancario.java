package Decorator.FiltroBancario;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TesteDeFiltroBancario {
    public static void main(String[] args) {
        Filtro filtros = new FiltroMenorQue100Reais(new FiltroMaiorQue500MilReais(new FiltroMesmoMes()));

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -10);
        Conta conta1 = new Conta("Felipe", 2000, calendar);
        Conta conta2 = new Conta("Carla", 4000, calendar);
        Conta conta3 = new Conta("João", 50, calendar);
        Conta conta4 = new Conta("Mateus", 500, calendar);
        Conta conta5 = new Conta("Lucio", 99, calendar);

        List<Conta> contas = new ArrayList<>();

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);

        List<Conta> returno = filtros.filtra(contas);
        for (Conta conta: returno) {
            System.out.println(conta.getTitular() + " - " + conta.getSaldo() + " - " + conta.getDataAbertura().getTime());
        }
    }
}
