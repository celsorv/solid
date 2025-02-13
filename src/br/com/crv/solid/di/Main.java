package br.com.crv.solid.di;

import br.com.crv.solid.di.good.Boleto;
import br.com.crv.solid.di.good.CartaoDeCredito;
import br.com.crv.solid.di.good.Pagamento;
import br.com.crv.solid.di.good.PagamentoMetodo;

public class Main {

    public static void main(String[] args) {
        PagamentoMetodo cartao = new CartaoDeCredito();
        PagamentoMetodo boleto = new Boleto();

        // A classe Pagamento recebe diferentes implementações de pagamento
        Pagamento pagamento1 = new Pagamento(cartao);
        Pagamento pagamento2 = new Pagamento(boleto);

        System.out.println("\n" + "CARTÃO DE CRÉDITO");
        pagamento1.realizarPagamento();

        System.out.println("\n" + "BOLETO");
        pagamento2.realizarPagamento();
    }

}