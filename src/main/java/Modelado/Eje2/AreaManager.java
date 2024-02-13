package Modelado.Eje2;

import java.time.LocalDate;

public class AreaManager extends Employee{

    private static final double fixedSalary = 2000;

    public AreaManager(String name, String surname, int socialSecurityNumber, String phone, LocalDate entryDate) {
        super(name, surname, socialSecurityNumber, phone, entryDate);
    }

    public double getSalary() {
        int antiquityPlus = getAntiquity() * 100;
        return fixedSalary + antiquityPlus;
    }
}
