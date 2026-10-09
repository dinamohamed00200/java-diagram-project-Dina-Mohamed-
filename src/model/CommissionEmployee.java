package model;

import java.time.LocalDate;

public class CommissionEmployee extends Employee {

    private double baseSalary;
    private double commissionRate;
    private double salesAmount;

    // Constructor
    public CommissionEmployee(int id, String name, Gender gender, LocalDate hireDate,
                              double baseSalary, double commissionRate, double salesAmount) {
        super(id, name, gender, hireDate);
        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
        this.salesAmount = salesAmount;
    }

    // Getters
    public double getBaseSalary() {
        return baseSalary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    // Setters
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    // العمولة = المبيعات × النسبة
    public double calculateCommission() {
        return salesAmount * commissionRate;
    }

    // المرتب = الأساسي + العمولة
    public double calculateSalary() {
        return baseSalary + calculateCommission();
    }

    public String toString() {
        return super.toString() + ", Salary: " + calculateSalary();
    }
}
