package ru.geekbrains.api.lesson1.cw;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("strResult = " + getString(str));
    }

    /**
     * @param str
     * @return
     * @apiNote Дана строка. Поменять местами ее половины.
     */
    private static String getString(String str) {
        return str.substring(str.length() / 2) + str.substring(0, str.length() / 2);
    }
}
