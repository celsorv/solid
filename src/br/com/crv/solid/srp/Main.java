package br.com.crv.solid.srp;


import br.com.crv.solid.srp.good.Employee;
import br.com.crv.solid.srp.good.TaxCalculator;

public class Main {

    public static void main(String[] args) {

        // Responsabilidade de gerenciar o funcionário
        Employee employee = new Employee("John", 1500.00);

        // Responsabilidade de calcular a taxa
        double taxValue = TaxCalculator.calculateTaxes(employee);

        System.out.println("\nA taxa de " + employee.getName() + " é de " + taxValue);

    }

}
