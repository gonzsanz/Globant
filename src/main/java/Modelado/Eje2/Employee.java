package Modelado.Eje2;

import java.time.LocalDate;
import java.time.Period;

public class Employee {

    private String name;
    private String surname;
    private int socialSecurityNumber;
    private String phone;
    private LocalDate entryDate;

    public Employee(String name, String surname, int socialSecurityNumber, String phone, LocalDate entryDate) {
        this.name = name;
        this.surname = surname;
        this.socialSecurityNumber = socialSecurityNumber;
        this.phone = phone;
        this.entryDate = entryDate;
    }

    public int getAntiquity() {
        return Period.between(entryDate, LocalDate.now()).getYears() + 1;
    }
}
