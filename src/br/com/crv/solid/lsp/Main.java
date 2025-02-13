package br.com.crv.solid.lsp;

import br.com.crv.solid.lsp.good.Penguin;
import br.com.crv.solid.lsp.good.Sparrow;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nPARDAL:");

        Sparrow sparrow = new Sparrow();
        sparrow.eat();
        sparrow.fly();

        System.out.println("\nPINGUIM:");

        Penguin penguin = new Penguin();
        penguin.eat();

    }

}
