package com.homeworks.app.homework1;

import com.homeworks.app.homework1.equipment.*;
import com.homeworks.app.homework1.moto.Motorcyclist;
import com.homeworks.app.homework1.moto.MotorcyclistService;

/**
 * Homework №1
 *
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 *
 *     1. Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
 *     2. Каждый класс должен иметь исчерпывающее смысл название и информативный состав.
 *     3. При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 *     4. Классы должны быть грамотно разложены по пакетам.
 *     5. Для демонстрации работы приложения использовать unit тесты.
 *
 * 7. Мотоциклист. Определить иерархию амуниции. Экипировать мотоциклиста. Посчитать стоимость.
 * Провести сортировку амуниции на основе веса. Найти элементы амуниции, соответствующие заданному диапазону параметров цены.
 */

public class Main {
    public static void main( String[] args ) {

        Motorcyclist motorcyclist = new Motorcyclist("Maks");
        MotorcyclistService motorcyclistService= new MotorcyclistService();

        motorcyclist.setMotorcyclistService(motorcyclistService);

        motorcyclistService.putEquipOn(new MotoJacket(25,45));
        motorcyclistService.putEquipOn(new Helmet(40,70));
        motorcyclistService.putEquipOn(new KneePads(16,30));
        motorcyclistService.putEquipOn(new MotoBoots(20,12));

        System.out.println(motorcyclist);
        System.out.println("Total cost: " + motorcyclist.getMotorcyclistService().countCost() + "\n");

        motorcyclistService.sortElementsEquipmentByWeight();
        System.out.println("\n" + motorcyclistService.findEquipByPriceRange(0,20));
    }
}
