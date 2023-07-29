package ru.geekbrains.api.lesson2.cw;

public class File05 {
        public static void main (String[] args) {
            String[] name = { "C", "е", "р", "г", "е", "й" };
            String sk = "СеРгЕЙ КА.";
            System.out.println(sk.toLowerCase()); // сергей ка.
            System.out.println(sk.substring(0,3));//СеР
            System.out.println(String.join("", name)); // Cергей
            System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
            // C,е,р,г,е,й
            System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
        }
}


