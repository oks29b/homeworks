package com.homeworks.app.homework1.equipment;

import com.homeworks.app.homework1.protectarea.LowerBodyProtection;

/**
 * This class describe element of equipment.
 * @author Oksana Borisenko
 */
public class MotoBoots extends LowerBodyProtection {
    public MotoBoots() {
        super();
    }

    //TODO: make an implementation of the method if necessary
    @Override
    public void putOnEquipment() {

    }
    public MotoBoots(double weight, double cost){
        super("Moto boots", weight, cost);
    }
}
