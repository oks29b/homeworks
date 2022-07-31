package com.homeworks.app.homework1.equipment;

import com.homeworks.app.homework1.protectarea.UpperBodyProtection;

/**
 * This class describe element of equipment.
 * @author Oksana Borisenko
 */
public class Shells extends UpperBodyProtection {
    public Shells(){
        super();
    }


    //TODO: make an implementation of the method if necessary
    @Override
    public void putOnEquipment() {

    }

    public Shells(double weight, double cost){
        super("Shell", weight, cost);
    }
}
