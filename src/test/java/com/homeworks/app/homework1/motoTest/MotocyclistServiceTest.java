package com.homeworks.app.homework1.motoTest;

import com.homeworks.app.homework1.equipment.Equipment;
import com.homeworks.app.homework1.equipment.Helmet;
import com.homeworks.app.homework1.equipment.KneePads;
import com.homeworks.app.homework1.equipment.Shells;
import com.homeworks.app.homework1.moto.MotorcyclistService;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MotocyclistServiceTest {

//    @Test
//    public void test1(){
//        MotorcyclistService motorcyclistService = new MotorcyclistService();
//        List<Equipment> expectedResult  = new ArrayList<>();
//        expectedResult .add(new Helmet(10,20));
//        expectedResult .add(new KneePads(20,30));
//        expectedResult .add(new Shells(40,50));
//
//        List<Equipment> actualResult = motorcyclistService.putOnSelectedElements();
//        Assert.assertEquals(expectedResult,actualResult);
//    }

    @Test
    public void test2(){
        MotorcyclistService motorcyclistService = new MotorcyclistService();
        List<Equipment> e  = new ArrayList<>();
        e.add(new Helmet(10,20));
        e.add(new KneePads(20,30));
        e.add(new Shells(40,50));
        motorcyclistService.setElementsOfEquipments(e);
        double expectedResult = 100;
        double actualResult = motorcyclistService.countCost();
        Assert.assertEquals(expectedResult,actualResult, 0.0);
    }

}
