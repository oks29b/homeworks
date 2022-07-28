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
//        Equipment equipment = new Helmet(200, 200);
//        Helmet h1 = new Helmet(165, 160);
//        EquipMotorcyclist equipMotorcyclist = new EquipMotorcyclist();
//        equipMotorcyclist.addElementOfEquipment(equipment);
//        equipMotorcyclist.addElementOfEquipment(h1);
//        System.out.println(h1.isStateEquipment());
//        h1.putOnEquipment();
//        System.out.println(h1.isStateEquipment());
//        System.out.println(equipMotorcyclist);
//        h1.putOnEquipment();
//        equipMotorcyclist.showEquipmentsByCost();
        Motorcyclist motorcyclist = new Motorcyclist("A");

        motorcyclist.showListEquipmentWhatYouCanWear();
        System.out.println(motorcyclist);

    }
}
