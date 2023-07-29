package ru.geekbrains.api.lesson3.cw;

import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList list = new ArrayList();
        list.add(2809);
        list.add(1247);
        list.add(211);
        list.add(28);
        list.add(809);

        for (Object i : list) {
            //System.out.println(i);
            System.out.printf("i = %d ", i);
        }
    }
}