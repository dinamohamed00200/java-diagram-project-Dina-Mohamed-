package model;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private int id;
    private String name;
    private Employee manager;
    private List<Employee> employees;

    // Constructor
    public Department(int id, String name, Employee manager, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.manager = manager;
        this.employees = employees;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employee getManager() {
        return manager;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    // إضافة موظف للقسم
    public void addEmployee(Employee employee) {
        employees.add(employee);
        employee.setDepartment(this);
    }

    // مسح موظف من القسم بالـ id
    public void removeEmployee(int employeeId) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == employeeId) {
                employees.remove(i);
                break;
            }
        }
    }

    // دور على موظف بالـ id
    public Employee findEmployee(int employeeId) {
        for (Employee e : employees) {
            if (e.getId() == employeeId) {
                return e;
            }
        }
        return null;
    }

    // مجموع مرتبات القسم
    public double calculateTotalPayroll() {
        double total = 0;
        for (Employee e : employees) {
            total = total + e.calculateSalary();
        }
        return total;
    }

    // اطبع كل الموظفين
    public void printAllEmployees() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public String toString() {
        return "Department ID: " + id + ", Name: " + name;
    }
}
