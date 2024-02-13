package Modelado.Eje2;

import java.time.LocalDate;

public class DepartmentDirector extends Employee {

private static final double fixedSalary = 3000;

    public DepartmentDirector(String name, String surname, int socialSecurityNumber, String phone, LocalDate entryDate) {
        super(name, surname, socialSecurityNumber, phone, entryDate);
    }

    public double getSalary() {
        int antiquityPlus = getAntiquity() * 1000;
        return fixedSalary + antiquityPlus;
    }
}
