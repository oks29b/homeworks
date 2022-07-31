package com.homeworks.app.homework1.equipment;

import com.homeworks.app.homework1.protectarea.UpperBodyProtection;

/**
 * This class describe element of equipment.
 * @author Oksana Borisenko
 */
public class MotoGloves extends UpperBodyProtection {
    public MotoGloves(){
        super();
    }


    //TODO: make an implementation of the method if necessary
    @Override
    public void putOnEquipment() {

    }

public MotoGloves(double weight, double cost){
    super("MotoGloves", weight, cost);
}
}
