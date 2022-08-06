package com.homeworks.app.homework1.motoTest;

import com.homeworks.app.homework1.equipment.Equipment;
import com.homeworks.app.homework1.equipment.Helmet;
import com.homeworks.app.homework1.equipment.KneePads;
import com.homeworks.app.homework1.equipment.Shells;
import com.homeworks.app.homework1.moto.MotorcyclistService;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
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

        MotorcyclistService motorcyclistService = new MotorcyclistService();
        motorcyclistService.putEquipOn(helmet);
        motorcyclistService.putEquipOn(kneePads);
        motorcyclistService.putEquipOn(shells);
        List<Equipment> actualResult = motorcyclistService.getElementsOfEquipments();

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void countCostTest(){
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

    @Test
    public void findEquipByPriceRangeTest1(){
        MotorcyclistService motorcyclistService = new MotorcyclistService();
        Helmet helmet =new Helmet(10,20);
        KneePads kneePads = new KneePads(20,30);
        Shells shells = new Shells(40,50);
        List<Equipment> expectedResult  = new ArrayList<>();
        expectedResult.add(helmet);
        expectedResult.add(kneePads);
        expectedResult.add(shells);
        motorcyclistService.setElementsOfEquipments(expectedResult);


        List<Equipment> actualResult  = new ArrayList<>();
        actualResult.add(helmet);
        actualResult.add(kneePads);

        Assert.assertEquals(motorcyclistService.findEquipByPriceRange(10,40),actualResult);
    }

    @Test
    public void findEquipByPriceRangeTest2(){
        MotorcyclistService motorcyclistService = new MotorcyclistService();
        Helmet helmet =new Helmet(10,20);
        KneePads kneePads = new KneePads(20,30);
        Shells shells = new Shells(40,50);
        List<Equipment> expectedResult  = new ArrayList<>();
        expectedResult.add(helmet);
        expectedResult.add(kneePads);
        expectedResult.add(shells);
        motorcyclistService.setElementsOfEquipments(expectedResult);


        List<Equipment> actualResult  = null;

        Assert.assertEquals(motorcyclistService.findEquipByPriceRange(0,10),actualResult);
    }


    @Test
    public void sortEquipmentMockitoTest(){
        MotorcyclistService mockMotoService = Mockito.mock(MotorcyclistService.class);
        mockMotoService.sortElementsEquipmentByWeight();
        verify(mockMotoService, times(1)).sortElementsEquipmentByWeight();
    }
}
