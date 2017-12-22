package com.codecool.krk.model;

import com.codecool.krk.dao.FakeCSV;
import com.codecool.krk.dao.FakeDB;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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
        FakeCSV.save(this);
    }

    public void saveToSQL(){
        FakeDB.save(this);
    }

    public static BadEmployee getById(int id){
        return FakeDB.getById(id);
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public int getAvailableHoliday(){
        long months = ChronoUnit.MONTHS.between(employmentDate, LocalDate.now());
        return (int) (months * 2 - usedHolidays);
    }


}
