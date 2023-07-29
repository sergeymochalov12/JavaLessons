package ru.geekbrains.api.lesson3.cw;

import java.util.Arrays;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = { day, month, year };
        List<Integer> d = Arrays.asList(date); // представляет собой список фиксированного размера,  не можем добавлять или удалять элементы из него.

        System.out.println(d); // [29, 9, 1990]
    }
}
