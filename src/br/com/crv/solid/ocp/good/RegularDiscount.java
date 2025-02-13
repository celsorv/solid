package br.com.crv.solid.ocp.good;

public class RegularDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.05;
    }
}