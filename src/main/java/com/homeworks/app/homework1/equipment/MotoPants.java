package com.homeworks.app.homework1.equipment;

import com.homeworks.app.homework1.protectarea.LowerBodyProtection;

/**
 * This class describe element of equipment.
 * @author Oksana Borisenko
 */
public class MotoPants extends LowerBodyProtection {
    public MotoPants(){
        super();
    }


    //TODO: make an implementation of the method if necessary
    @Override
    public void putOnEquipment() {

    }

    public MotoPants(double weight, double cost){
        super("MotoPants", weight, cost);
    }
}
