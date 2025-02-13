package br.com.crv.solid.srp.bad;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateTaxes() {
        return this.salary * 0.2; // Exemplo: 20% de imposto
    }
}
