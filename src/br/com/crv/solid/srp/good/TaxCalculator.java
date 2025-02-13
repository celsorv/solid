package br.com.crv.solid.srp.good;

public class TaxCalculator {
    public static double calculateTaxes(Employee employee) {
        return employee.getSalary() * 0.2;
    }
}
