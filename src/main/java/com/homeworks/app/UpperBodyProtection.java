package com.homeworks.app;

public abstract class UpperBodyProtection extends Equipment {

    public UpperBodyProtection(){
        super();
    }

    public UpperBodyProtection(String name, double weight) {
        super(name, weight);
        setCategory("Upper body protection");
    }

    public UpperBodyProtection(String name, double weight, double cost) {
        super(name, weight, cost);
        setCategory("Upper body protection");
    }

}
