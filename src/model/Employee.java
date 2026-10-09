package model;

import java.time.LocalDate;

public abstract class Employee {

    private int id;
    private String name;
    private Gender gender;
    private LocalDate hireDate;
    private Department department;

    // Constructor
    public Employee(int id, String name, Gender gender, LocalDate hireDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.hireDate = hireDate;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public Department getDepartment() {
        return department;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    // كل نوع موظف هيحسب مرتبه بطريقته
    public abstract double calculateSalary();

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Gender: " + gender + ", Hire Date: " + hireDate;
    }
}
