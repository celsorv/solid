package br.com.crv.solid.di.good;

public class Pagamento {
    private PagamentoMetodo pagamentoMetodo;

    // A dependência é injetada via construtor
    public Pagamento(PagamentoMetodo pagamentoMetodo) {
        this.pagamentoMetodo = pagamentoMetodo;
    }

    public void realizarPagamento() {
        pagamentoMetodo.processarPagamento();
    }
}