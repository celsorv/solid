package br.com.crv.solid.ocp;

import br.com.crv.solid.ocp.good.DiscountCalculator;
import br.com.crv.solid.ocp.good.DiscountStrategy;
import br.com.crv.solid.ocp.good.RegularDiscount;
import br.com.crv.solid.ocp.good.VIPDiscount;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        DiscountStrategy regular = new RegularDiscount();
        DiscountStrategy vip = new VIPDiscount();

        System.out.println("Desconto Regular: " + calculator.calculateDiscount(regular, 1000));
        System.out.println("Desconto VIP: " + calculator.calculateDiscount(vip, 1000));
    }
}