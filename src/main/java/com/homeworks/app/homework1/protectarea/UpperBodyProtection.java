package com.homeworks.app.homework1.protectarea;

import com.homeworks.app.homework1.equip.Equipment;

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
