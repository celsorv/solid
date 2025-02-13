package br.com.crv.solid.ocp.good;

public class VIPDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.10;
    }
}