package com.homeworks.app.homework1.motoTest;

import com.homeworks.app.homework1.equipment.Equipment;
import com.homeworks.app.homework1.equipment.Helmet;
import com.homeworks.app.homework1.moto.EquipMotorcyclist;
import org.junit.Assert;
import org.junit.Test;

public class EquipMotocyclistTest {

    @Test
    public void Test1(){
        EquipMotorcyclist equipMotorcyclist = new EquipMotorcyclist();
        boolean expectedResult = true;
        boolean actualResult = equipMotorcyclist.addElementOfEquipment(new Helmet());
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void Test2(){
        EquipMotorcyclist equipMotorcyclist = new EquipMotorcyclist();
        equipMotorcyclist.addElementOfEquipment(new Helmet(50,100));
        equipMotorcyclist.addElementOfEquipment(new Helmet(50,100));
        equipMotorcyclist.addElementOfEquipment(new Helmet(50,100));
        double expectedResult = 300;
        double actualResult = equipMotorcyclist.countCost();
        Assert.assertEquals(expectedResult,actualResult, 0.0);
    }

}
