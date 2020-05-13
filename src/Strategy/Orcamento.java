package Strategy;

import ChainOfResponsibility.Item;
import State.EmAprovacao;
import State.EstadoDeUmOrcamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    public double valor;
    private List<Item> itens;

    public EstadoDeUmOrcamento estadoAtual;

    public Orcamento(double valor) {
        this.valor = valor;
        this.itens = new ArrayList<>();
        this.estadoAtual = new EmAprovacao();
    }

    public double getValor() {
        return valor;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public boolean contemItemDeNome(String nomeDoItem) {
        for (Item item : itens) {
            if (item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }

    public void aplicaDescontoExtra() {
        estadoAtual.aplicaDescontoExtra(this);
    }

    public void aprova() {
        estadoAtual.aprova(this);
    }

    public void reprova() {
        estadoAtual.reprova(this);
    }

    public void finaliza() {
        estadoAtual.finaliza(this);
    }
}
