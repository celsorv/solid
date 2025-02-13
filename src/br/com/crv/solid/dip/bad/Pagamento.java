package br.com.crv.solid.dip.bad;

public class Pagamento {
    private Boleto boleto;

    public Pagamento() {
        this.boleto = new Boleto(); // Pagamento depende diretamente de Boleto
    }

    public void realizarPagamento() {
        boleto.emitir();
        // código para realizar o pagamento
    }
}
