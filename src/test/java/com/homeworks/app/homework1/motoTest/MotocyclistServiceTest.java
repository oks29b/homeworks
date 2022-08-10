package com.homeworks.app.homework1.motoTest;

import com.homeworks.app.homework1.equipment.*;
import com.homeworks.app.homework1.moto.Motorcyclist;
import com.homeworks.app.homework1.moto.MotorcyclistService;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class MotocyclistServiceTest {

    @Test
    public void putEquipOnTest(){
        Helmet helmet =new Helmet(10,20);
        KneePads kneePads = new KneePads(20,30);
        Shells shells = new Shells(40,50);
        List<Equipment> expectedResult  = new ArrayList<>();
        expectedResult.add(helmet);
        expectedResult.add(kneePads);
        expectedResult.add(shells);

        Motorcyclist motorcyclist = new Motorcyclist();
        MotorcyclistService motorcyclistService = new MotorcyclistService();

        motorcyclistService.putEquipOn(motorcyclist.getElementsOfEquipments(), helmet);
        motorcyclistService.putEquipOn(motorcyclist.getElementsOfEquipments(), kneePads);
        motorcyclistService.putEquipOn(motorcyclist.getElementsOfEquipments(), shells);
        List<Equipment> actualResult = motorcyclist.getElementsOfEquipments();

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void countCostTest(){
        MotorcyclistService motorcyclistService = new MotorcyclistService();
        Motorcyclist motorcyclist = new Motorcyclist();

        List<Equipment> e  = new ArrayList<>();
        e.add(new Helmet(10,20));
        e.add(new KneePads(20,30));
        e.add(new Shells(40,50));

        motorcyclist.setElementsOfEquipments(e);

        double expectedResult = 100;
        double actualResult = motorcyclistService.countCost(motorcyclist.getElementsOfEquipments());

        Assert.assertEquals(expectedResult,actualResult, 0.0);
    }

    @Test
    public void findEquipByPriceRangeTest1(){
        MotorcyclistService motorcyclistService = new MotorcyclistService();
        Motorcyclist motorcyclist = new Motorcyclist();

        Helmet helmet =new Helmet(10,20);
        KneePads kneePads = new KneePads(20,30);
        Shells shells = new Shells(40,50);

        List<Equipment> expectedResult  = new ArrayList<>();
        expectedResult.add(helmet);
        expectedResult.add(kneePads);
        expectedResult.add(shells);

        motorcyclist.setElementsOfEquipments(expectedResult);


        List<Equipment> actualResult  = new ArrayList<>();
        actualResult.add(helmet);
        actualResult.add(kneePads);

        Assert.assertEquals(motorcyclistService.findEquipByPriceRange(10,40, expectedResult),actualResult);
    }

    @Test
    public void findEquipByPriceRangeTest2(){
        MotorcyclistService motorcyclistService = new MotorcyclistService();
        Motorcyclist motorcyclist = new Motorcyclist();

        Helmet helmet =new Helmet(10,20);
        KneePads kneePads = new KneePads(20,30);
        Shells shells = new Shells(40,50);

        List<Equipment> expectedResult  = new ArrayList<>();
        expectedResult.add(helmet);
        expectedResult.add(kneePads);
        expectedResult.add(shells);
        motorcyclist.setElementsOfEquipments(expectedResult);


        List<Equipment> actualResult  = null;

        Assert.assertEquals(motorcyclistService.findEquipByPriceRange(0,10, expectedResult),actualResult);
    }


    @Test
    public void sortEquipmentMockitoTest(){
        MotorcyclistService mockMotoService = Mockito.mock(MotorcyclistService.class);
        Motorcyclist motorcyclist = new Motorcyclist();

        mockMotoService.sortElementsEquipmentByWeight(motorcyclist.getElementsOfEquipments());

        verify(mockMotoService, times(1)).sortElementsEquipmentByWeight(motorcyclist.getElementsOfEquipments());
    }
}
