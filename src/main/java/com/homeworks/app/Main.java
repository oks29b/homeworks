package com.homeworks.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main( String[] args ) {
Motorcyclist motorcyclist = new Motorcyclist("BOB");
        System.out.println(motorcyclist);
        Equipment equipment = new Helmet();
        equipment.setCost(1000);
        Helmet helmet = new Helmet();
        helmet.putOnEquipment();
        equipment.putOnEquipment();
        List<Equipment> equipmentList = new ArrayList<Equipment>();
        equipmentList.add(helmet);
        System.out.println(equipmentList);
    }
}
