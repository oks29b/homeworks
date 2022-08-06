package com.homeworks.app.homework1.moto;

import com.homeworks.app.homework1.equipment.*;

import java.util.*;

/**
 * This class provides methods to put on, to sort, to find, to count cost, to show equipment.
 * @author Oksana Borisenko
 */

public class MotorcyclistService{

    private List<Equipment> elementsOfEquipments = new ArrayList<Equipment>();

    public List<Equipment> getElementsOfEquipments() {
        return elementsOfEquipments;
    }

    public void setElementsOfEquipments(List<Equipment> elementsOfEquipments) {
        this.elementsOfEquipments = elementsOfEquipments;
    }



    /**
     * Default constructor
     */
    public MotorcyclistService() {
    }

    /**
     * @brief Put equip on
     */

    public List<Equipment> putEquipOn(Equipment e) {

        for(Equipment it: elementsOfEquipments) {
            if(e.getName() == it.getName()) {
                System.out.println(e.getName() + " is already put on!");
                return elementsOfEquipments;
            }
        }
        elementsOfEquipments.add(e);
        return elementsOfEquipments;
    }

    /**
     * @return Total equipment cost
     */
    public double countCost(){
        double cost = 0;
        for (Equipment e:elementsOfEquipments) {
            cost += e.getCost();
        }
        return cost;
    }

    /** Sort equipment by weight */
    public void sortElementsEquipmentByWeight(){
        Collections.sort(elementsOfEquipments, new Comparator<Equipment>() {
            @Override
            public int compare(Equipment e1, Equipment e2) {
                return (int) (e1.getWeight() - e2.getWeight());
            }
        });

        System.out.println("Sort equipment by weight\n" + elementsOfEquipments.toString());
    }


    /**
     * @brief Find equipment according to the given price
     * by lower - upper range
     * @return List of found equipment.
     */

    public List<Equipment>findEquipByPriceRange(double lowerCost, double upperCost){
        double cost;
        List<Equipment> equipment = new ArrayList<>();
        System.out.println("The costs of equipments ranges from " + lowerCost + " to " + upperCost + ": ");
        for(Equipment e: elementsOfEquipments){
            cost = e.getCost();
            if(cost >= lowerCost && cost <= upperCost) {
                equipment.add(e);
            }
        }
        if(equipment.isEmpty()){System.out.println("There is no equipment in this price range");
        return null;
        }else {
            return equipment;
        }
    }

    /**
     * Output to the console.
     */
    @Override
    public String toString() {
        return "\nelement of equipments = " + "\n" + elementsOfEquipments + "\n";
    }
}
