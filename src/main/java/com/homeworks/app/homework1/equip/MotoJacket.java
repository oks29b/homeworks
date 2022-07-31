package com.homeworks.app.homework1.equip;

import com.homeworks.app.homework1.protectarea.UpperBodyProtection;

/**
 * This class describe element of equipment.
 * @author Oksana Borisenko
 */
public class MotoJacket extends UpperBodyProtection {
    public MotoJacket(){
        super();
    }


    //TODO: make an implementation of the method if necessary
    @Override
    public void putOnEquipment() {

    }

    public MotoJacket(double weight, double cost){
        super("MotoJacket", weight, cost);
    }

}
