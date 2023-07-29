package ru.geekbrains.api.lesson3.hw;

public class TestVector {
    public static void main(String[] args) {
        Vektor vektor = new Vektor(1, 2, 3);
        Vektor vektor2 = new Vektor(3, 1, 2);

        System.out.println("vektor = " + vektor);
        System.out.println("vektor.length() = " + vektor.length());
        System.out.println("vektor.scalar(vektor2) = " + vektor.scalar(vektor2));
        System.out.println("vektor.proizv(vektor2) = " + vektor.proizv(vektor2));
        System.out.println("vektor.cos(vektor2) = " + vektor.cos(vektor2));
    }
}

