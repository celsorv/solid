package br.com.crv.solid.di.good;

public class CartaoDeCredito implements PagamentoMetodo {
    @Override
    public void processarPagamento() {
        System.out.println("\tPagamento realizado com Cartão de Crédito.");
    }
}
