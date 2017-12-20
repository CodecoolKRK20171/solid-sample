package com.codecool.krk.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BadEmployee {

    private String firstName;
    private String lastName;
    private int age;
    private LocalDate employmentDate;
    private BigDecimal netSalary;
    private String title;
    private int usedHolidays;


    public void display(){
        System.out.println("Hello my name is " + lastName +
                ", " + firstName + " " + lastName);
    }

    public String toString(){
        return firstName + " " + lastName;
    }

    public String toJSON(){
        return "{ \"firstName\": \"" + firstName +
                "\", \"lastName\": \"" + lastName + "\" }";
    }

    public BigDecimal getGrossSalary(){
        return netSalary.multiply(BigDecimal.valueOf(1.23));
    }

    public void saveToCSV(){
        System.out.println("saving to CSV :}...");
    }

    public void saveToSQL(){
        System.out.println("saving to SQL db :]");
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public int getAvailableHoliday(){
        long months = ChronoUnit.MONTHS.between(employmentDate, LocalDate.now());
        return (int) (months * 2 - usedHolidays);
    }


}
