package br.com.crv.solid.di.good;

public class Boleto implements PagamentoMetodo {
    @Override
    public void processarPagamento() {
        System.out.println("\tPagamento realizado com Boleto.");
    }
}
