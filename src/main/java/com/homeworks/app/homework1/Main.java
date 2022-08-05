package com.homeworks.app.homework1;

import com.homeworks.app.homework1.equipment.Helmet;
import com.homeworks.app.homework1.equipment.KneePads;
import com.homeworks.app.homework1.equipment.Shells;
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

        MotorcyclistService motorcyclistService= new MotorcyclistService();

        Motorcyclist motorcyclist = new Motorcyclist("Maks", motorcyclistService);
        motorcyclistService.putEquipOn(new Shells(10,20));
        motorcyclistService.putEquipOn(new Helmet(20,30));
        motorcyclistService.putEquipOn(new KneePads(20,30));
        System.out.println(motorcyclistService.findEquipByPriceRange(0,1));
        System.out.println(motorcyclist);
    }
}
