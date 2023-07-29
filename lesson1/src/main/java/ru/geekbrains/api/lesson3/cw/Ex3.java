package ru.geekbrains.api.lesson3.cw;

import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(10);
        ArrayList<Integer> list4 = new ArrayList<>(10);
        System.out.println("list3 ");
        System.out.println(list3);
        System.out.println("Положили значение в list3 ");
        list3.add(123);
        list3.add(12);
        list3.add(23);
        list3.add(523);

        System.out.println("Выводим list3 ");
        System.out.println("list3 =  " + list3);
        System.out.println("list3.get(2) =  " + list3.get(2)); // выводит только 3-й элемент (с 0-го)

    }
}
