package test;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainTest {

    public static void main(String[] args) {

        // 1) نعمل موظفين من الأنواع التلاتة
        CommissionEmployee emp1 = new CommissionEmployee(
                1, "Ahmed", Gender.MALE, LocalDate.of(2020, 1, 15),
                3000, 0.10, 20000);

        MonthlyEmployee emp2 = new MonthlyEmployee(
                2, "Sara", Gender.FEMALE, LocalDate.of(2015, 6, 1),
                5000, 21, 10, true);

        HourlyEmployee emp3 = new HourlyEmployee(
                3, "Omar", Gender.MALE, LocalDate.of(2022, 3, 10),
                50, 45, 75);

        // 2) نعمل قسم ونخلي Sara هي المدير
        Department dept = new Department(100, "Sales", emp2, new ArrayList<>());

        // 3) نضيف الموظفين للقسم
        dept.addEmployee(emp1);
        dept.addEmployee(emp2);
        dept.addEmployee(emp3);

        // 4) نطبع بيانات القسم والموظفين
        System.out.println(dept);
        System.out.println("Manager: " + dept.getManager().getName());
        System.out.println("-------------------");
        dept.printAllEmployees();

        // 5) نجرب باقي الدوال
        System.out.println("-------------------");
        System.out.println("Total Payroll: " + dept.calculateTotalPayroll());
        System.out.println("Sara extra vacation: " + emp2.calculateAdditionalVacation());
        System.out.println("Ahmed commission: " + emp1.calculateCommission());

        // 6) نبحث عن موظف
        System.out.println("-------------------");
        Employee found = dept.findEmployee(3);
        System.out.println("Found: " + found.getName());

        // 7) نمسح موظف ونطبع تاني
        dept.removeEmployee(3);
        System.out.println("After removing Omar:");
        dept.printAllEmployees();
    }
}