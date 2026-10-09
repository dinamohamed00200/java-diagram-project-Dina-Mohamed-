package model;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private double hourlyRate;
    private double hoursWorked;
    private double overtimeRate;

    // Constructor
    public HourlyEmployee(int id, String name, Gender gender, LocalDate hireDate,
                          double hourlyRate, double hoursWorked, double overtimeRate) {
        super(id, name, gender, hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.overtimeRate = overtimeRate;
    }

    // Getters
    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    // Setters
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    // أول 40 ساعة بالسعر العادي، وأي زيادة بسعر الأوفرتايم
    public double calculateSalary() {
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyRate;
        } else {
            double overtimeHours = hoursWorked - 40;
            return (40 * hourlyRate) + (overtimeHours * overtimeRate);
        }
    }

    public String toString() {
        return super.toString() + ", Salary: " + calculateSalary();
    }
}
