package ru.geekbrains.api.lesson3.cw;

import java.util.Iterator;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) {
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) {
            col.remove();
            System.out.println(col.next());
            //col.next();
        }
    }
}

