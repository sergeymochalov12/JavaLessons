package ru.geekbrains.api.lesson1.hw;

import java.util.Scanner;

public class zadani2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("result = " + methodOne(n));
        scanner.close();
    }

    /**
     * @param n исходное число
     * @return рез
     * @apiNote https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
     */
    private static int methodOne(int n) {
        int pr = 1;
        int sum = 0;
        while (n != 0) {
            pr *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return pr - sum;
    }

}