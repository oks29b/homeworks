package com.homeworks.app.homework1.moto;

import com.homeworks.app.homework1.equipment.*;

import java.util.*;

/**
 * This class provides methods to put on, to sort, to find, to count cost, to show equipment.
 * @author Oksana Borisenko
 */

public class MotorcyclistService{

    /**
     * Default constructor
     */
    public MotorcyclistService() {
    }

    /**
     * @brief Put equip on
     */

    public List<Equipment> putEquipOn(List<Equipment> e, Equipment equipment) {

        for(Equipment it: e) {
            if(equipment.getName() == it.getName()) {
                System.out.println(equipment.getName() + " is already put on!");
                return e;
            }
        }
        e.add(equipment);
        return e;
    }

    /**
     * @return Total equipment cost
     */
    public double countCost(List<Equipment> equipment){
        double cost = 0;
        for (Equipment e:equipment) {
            cost += e.getCost();
        }
        return cost;
    }

    /** Sort equipment by weight */
    public void sortElementsEquipmentByWeight(List<Equipment> equipment){
        Collections.sort(equipment, new Comparator<Equipment>() {
            @Override
            public int compare(Equipment e1, Equipment e2) {
                return (int) (e1.getWeight() - e2.getWeight());
            }
        });

        System.out.println("Sort equipment by weight\n" + equipment.toString());
    }


    /**
     * @brief Find equipment according to the given price
     * by lower - upper range
     * @return List of found equipment.
     */

    public List<Equipment>findEquipByPriceRange(double lowerCost, double upperCost, List<Equipment> equipment){
        double cost;
        List<Equipment> newEquipment = new ArrayList<>();
        System.out.println("The costs of equipments ranges from " + lowerCost + " to " + upperCost + ": ");
        for(Equipment e: equipment){
            cost = e.getCost();
            if(cost >= lowerCost && cost <= upperCost) {
                newEquipment.add(e);
            }
        }

        if(newEquipment.isEmpty()){System.out.println("There is no equipment in this price range");
            return null;
        }else {
            return newEquipment;
        }
    }

}
