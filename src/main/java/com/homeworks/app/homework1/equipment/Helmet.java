package com.homeworks.app.homework1.equipment;

import com.homeworks.app.homework1.protectarea.UpperBodyProtection;

/**
 * This class describe element of equipment.
 * @author Oksana Borisenko
 */
public class Helmet extends UpperBodyProtection {

    public Helmet(){
        super();
    }


    //TODO: make an implementation of the method if necessary
    //for example, realised abstract method which is not used anywhere

    @Override
    public void putOnEquipment() {
        if(!isStateEquipment()){
            setStateEquipment(true);
            System.out.println("Helmet put on");
        } else {
            System.out.println("The helmet is already on!");
        }
    }

    public Helmet(double weight, double cost) {
        super("Helmet", weight, cost);
    }
}
