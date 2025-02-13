package br.com.crv.solid.ocp.good;

public class DiscountCalculator {
    public double calculateDiscount(DiscountStrategy strategy, double amount) {
        return strategy.applyDiscount(amount);
    }
}