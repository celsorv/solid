package br.com.crv.solid.lsp.good;

public class Sparrow implements FlyingBird {
    @Override
    public void eat() {
        System.out.println("Pardal está comendo.");
    }

    @Override
    public void fly() {
        System.out.println("Pardal está voando!");
    }
}
