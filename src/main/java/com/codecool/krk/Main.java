package com.codecool.krk;

import com.codecool.krk.model.BadEmployee;

public class Main {
    public static void main(String[] args) {
        BadEmployee emp = BadEmployee.getById(1);
        emp.setFirstName("Bożydar");
        emp.saveToSQL();
    }
}
