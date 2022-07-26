package com.homeworks.app;

public class UpperBodyProtection extends Equipment {

    public UpperBodyProtection(String name, double weight) {
        super(name, weight);
        setCategory("Upper body protection");
    }

    public UpperBodyProtection(String name, double weight, double cost) {
        super(name, weight, cost);
        setCategory("Upper body protection");
    }
}
