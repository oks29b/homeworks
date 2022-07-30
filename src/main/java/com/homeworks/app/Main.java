package com.homeworks.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

//        motorcyclist.putOnSelectedElementsEquipment();

        motorcyclist.showOptions();
        System.out.println(motorcyclist);


    }
}
