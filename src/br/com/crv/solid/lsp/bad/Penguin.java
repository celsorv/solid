package br.com.crv.solid.lsp.bad;

public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Pinguins não voam!");
    }
}
