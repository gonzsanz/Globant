package Modelado;

import java.util.ArrayList;
import java.util.List;

public class Eje3 {

    List<Employee> employees;

    public Eje3() {
        this.employees = new ArrayList<>();
    }

    public int getNumberOfEmployees() {
        return employees.size();
    }

    public double getTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public double getAverageSalary() {
        return getTotalSalary() / getNumberOfEmployees();
    }

    public double maxSalaryByCategory(String category) {
        double maxSalary = 0;
        for (Employee employee : employees) {
            if (employee.getCategory().equals(category) && (employee.getSalary() > maxSalary)) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    public double minSalaryByCategory(String category) {
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getCategory().equals(category) && (employee.getSalary() < minSalary)) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }

}
