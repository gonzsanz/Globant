package Modelado;

public class Employee {

    private double salary;
    private String category;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getCategory() {
        return category;
    }
}
