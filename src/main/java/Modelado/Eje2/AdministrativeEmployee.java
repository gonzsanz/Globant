package Modelado.Eje2;

import java.time.LocalDate;

public class AdministrativeEmployee extends Employee {

    private int hoursWorked;
    private double salaryByHour;

    public AdministrativeEmployee(String name, String surname, int socialSecurityNumber, String phone, LocalDate entryDate, int hoursWorked, double salaryByHour) {
        super(name, surname, socialSecurityNumber, phone, entryDate);
        this.hoursWorked = hoursWorked;
        this.salaryByHour = salaryByHour;
    }

    public double getSalary() {
        int daysWorked = 22;
        return hoursWorked * daysWorked * salaryByHour;
    }
}
