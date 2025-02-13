package br.com.crv.solid.di.bad;

import br.com.crv.solid.di.good.CartaoDeCredito;

public class Pagamento {
    private CartaoDeCredito cartaoDeCredito;

    public Pagamento() {
        cartaoDeCredito = new CartaoDeCredito(); // Dependência diretamente criada
    }

    public void realizarPagamento() {
        cartaoDeCredito.processarPagamento();
    }
}