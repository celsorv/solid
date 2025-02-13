package br.com.crv.solid.dip.good;

public class Boleto implements PagamentoMetodo {
    @Override
    public void realizarPagamento() {
        System.out.println("Emitindo boleto...");
    }
}
