package model;

import java.time.LocalDate;

public class MonthlyEmployee extends Employee {

    private double monthlySalary;
    private int vacationDays;
    private double bonousPercentage;
    private boolean hasHealthInsurance;

    // Constructor
    public MonthlyEmployee(int id, String name, Gender gender, LocalDate hireDate,
                           double monthlySalary, int vacationDays,
                           double bonousPercentage, boolean hasHealthInsurance) {
        super(id, name, gender, hireDate);
        this.monthlySalary = monthlySalary;
        this.vacationDays = vacationDays;
        this.bonousPercentage = bonousPercentage;
        this.hasHealthInsurance = hasHealthInsurance;
    }

    // Getters
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public double getBonousPercentage() {
        return bonousPercentage;
    }

    public boolean isHasHealthInsurance() {
        return hasHealthInsurance;
    }

    // Setters
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public void setBonousPercentage(double bonousPercentage) {
        this.bonousPercentage = bonousPercentage;
    }

    public void setHasHealthInsurance(boolean hasHealthInsurance) {
        this.hasHealthInsurance = hasHealthInsurance;
    }

    // المرتب = الشهري + البونص
    public double calculateSalary() {
        return monthlySalary + (monthlySalary * bonousPercentage / 100);
    }

    // كل 5 سنين خدمة = يوم إجازة إضافي (مثال بسيط)
    public int calculateAdditionalVacation() {
        int years = LocalDate.now().getYear() - getHireDate().getYear();
        return years / 5;
    }

    public String toString() {
        return super.toString() + ", Salary: " + calculateSalary();
    }
}