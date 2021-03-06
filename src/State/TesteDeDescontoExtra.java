package State;

import Strategy.Orcamento;

public class TesteDeDescontoExtra {
    public static void main(String[] args) {
        Orcamento reforma = new Orcamento(500.00);

        reforma.aplicaDescontoExtra();

        System.out.println(reforma.getValor());

        reforma.aprova();
        reforma.aplicaDescontoExtra();
        reforma.aplicaDescontoExtra();
        reforma.aplicaDescontoExtra();

        System.out.println(reforma.getValor());

        reforma.finaliza();
        reforma.aplicaDescontoExtra();
    }
}
