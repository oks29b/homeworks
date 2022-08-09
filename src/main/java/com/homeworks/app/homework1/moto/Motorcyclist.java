package com.homeworks.app.homework1.moto;


import com.homeworks.app.homework1.equipment.Equipment;

import java.util.ArrayList;
import java.util.List;

/**
 * This class realizes the main logic of the program, provides methods to
 * equip motorcyclist.
 * @author Oksana Borisenko
 */

public class Motorcyclist{
    private String name; //motorcyclist's name

    private List<Equipment> elementsOfEquipments = new ArrayList<Equipment>();

    /**
     * Default constructor.
     */

    public Motorcyclist() {
        name = "Maks";
    }

    /**
     * Constructor with parameter - name.
     */

    public Motorcyclist (String name) {
        this.name = name;
    }


    /**
     * Constructor with all parameter.
     */

    public Motorcyclist(String name, List<Equipment> elementsOfEquipments) {
        this.name = name;
        this.elementsOfEquipments = elementsOfEquipments;
    }

    /**
     * Created getters and setters.
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Equipment> getElementsOfEquipments() {
        return elementsOfEquipments;
    }

    public void setElementsOfEquipments(List<Equipment> elementsOfEquipments) {
        this.elementsOfEquipments = elementsOfEquipments;
    }

    /**
     * Output to the console.
     */

    @Override
    public String toString() {
        return "Motorcyclist name is " + name +". He is wearing:\n " + elementsOfEquipments;
    }
}
