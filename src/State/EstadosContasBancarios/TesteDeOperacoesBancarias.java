package State.EstadosContasBancarios;

import java.util.Calendar;

public class TesteDeOperacoesBancarias {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -10);
        Conta conta = new Conta("Felipe Pereira", 500.00, calendar);

        conta.operacaoSaque(300);
        System.out.println(conta.getSaldo());

        conta.operacaoSaque(400);
        System.out.println(conta.getSaldo());

        conta.operacaoDeposito(200);
        System.out.println(conta.getSaldo());
    }
}
