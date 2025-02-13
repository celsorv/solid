package br.com.crv.solid.dip.good;

public class Pagamento {
    private PagamentoMetodo metodoPagamento;

    public Pagamento(PagamentoMetodo metodoPagamento) {
        this.metodoPagamento = metodoPagamento; // Injeção de dependência
    }

    public void realizarPagamento() {
        metodoPagamento.realizarPagamento();
    }
}
