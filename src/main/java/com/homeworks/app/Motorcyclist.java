package com.homeworks.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Motorcyclist {
    private String name; //motorcyclist's name


    /**
     * Default constructor.
     */

    public Motorcyclist() {
        name = "Maks";
    }

    /**
     * Constructor with parameter - name.
     */

    public Motorcyclist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Motorcyclist " +
                "name is " + name;
    }
}
