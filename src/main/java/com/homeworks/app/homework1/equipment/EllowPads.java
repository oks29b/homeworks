package com.homeworks.app.homework1.equipment;

import com.homeworks.app.homework1.protectarea.UpperBodyProtection;

/**
 * This class describe element of equipment.
 * @author Oksana Borisenko
 */

public class EllowPads extends UpperBodyProtection {


    public EllowPads(){
        super();
    }

    //TODO: make an implementation of the method if necessary
    @Override
    public void putOnEquipment() {
    }

    public EllowPads(double weight, double cost) {
        super("Ellow Pads", weight, cost);
    }
}
