package com.homeworks.app.homework1.protectarea;

import com.homeworks.app.homework1.equip.Equipment;

public abstract class LowerBodyProtection extends Equipment {
    public LowerBodyProtection(){
        super();
    }

    public LowerBodyProtection(String name, double weight) {
        super(name, weight);
        setCategory("Lower body protection");
    }


    public LowerBodyProtection(String name, double weight, double cost) {
        super(name, weight, cost);
        setCategory("Lower body protection");
    }
}
