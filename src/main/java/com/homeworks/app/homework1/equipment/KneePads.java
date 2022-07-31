package com.homeworks.app.homework1.equipment;

import com.homeworks.app.homework1.protectarea.LowerBodyProtection;

/**
 * This class describe element of equipment.
 * @author Oksana Borisenko
 */
public class KneePads extends LowerBodyProtection {
    public KneePads(){
        super();
    }

    //TODO: make an implementation of the method if necessary
    @Override
    public void putOnEquipment() {
    }

    public KneePads(double weight, double cost){
        super("Knee Pads", weight, cost);
    }

}
