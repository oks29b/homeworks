package com.homeworks.app.homework1.motoTest;

import com.homeworks.app.homework1.equipment.Helmet;
import com.homeworks.app.homework1.moto.MotorcyclistService;
import org.junit.Assert;
import org.junit.Test;

public class EquipMotocyclistTest {

    @Test
    public void test1(){
        MotorcyclistService motorcyclistService = new MotorcyclistService();
        boolean expectedResult = true;
        boolean actualResult = motorcyclistService.addElementOfEquipment(new Helmet());
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void test2(){
        MotorcyclistService motorcyclistService = new MotorcyclistService();
        motorcyclistService.addElementOfEquipment(new Helmet(50,100));
        motorcyclistService.addElementOfEquipment(new Helmet(50,100));
        motorcyclistService.addElementOfEquipment(new Helmet(50,100));
        double expectedResult = 300;
        double actualResult = motorcyclistService.countCost();
        Assert.assertEquals(expectedResult,actualResult, 0.0);
    }

}
