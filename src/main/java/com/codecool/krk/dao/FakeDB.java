package com.codecool.krk.dao;

import com.codecool.krk.model.BadEmployee;

public class FakeDB {
    public static void save(BadEmployee badEmployee) {
        System.out.println("Saving to db");
    }

    public static BadEmployee getById(int id) {
        return new BadEmployee();
    }
}
