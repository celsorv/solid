package br.com.crv.solid.ocp.bad;

public class DiscountCalculator {
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("Regular")) {
            return amount * 0.05;
        } else if (customerType.equals("VIP")) {
            return amount * 0.10;
        } else {
            return 0;
        }
    }
}
