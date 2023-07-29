package Lesson_02;
public class Ex001_stringsDemo {
    private static java.lang.Object System;

    public static void main_(String[] args) {
        java.lang.String[] name = { "C", "е", "р", "г", "е", "й" };
        java.lang.String sk;
        sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
        // C,е,р,г,е,й
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
    }
}
