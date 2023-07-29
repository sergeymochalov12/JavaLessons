package ru.geekbrains.api.lesson3.cw;

import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
            Character value = null;
            List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
            System.out.println("list1 = " + list1);
            //list1.remove('S');
            System.out.println("list1 = " + list1);

             List<Character> list2 = List.copyOf(list1);
            System.out.println("list2 = " + list2);
        }

    }
