package com.pakker.part5;

import java.util.Arrays;
import java.util.Scanner;

public class Question03 {

    //https://www.acmicpc.net/problem/2577
    static int[] result = new int[10];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 1;
        for (int i = 0; i < 3; i++) {
            number *= scanner.nextInt();
        }

        int numberLength = (int) (Math.log10(number) + 1);
        getRemainder(number, numberLength);

        Arrays.stream(result).forEach(System.out::println);
    }

    public static int getRemainder(int number, int length) {
        int quotient = (int) (number / Math.pow(10, length - 1));
        int remainder = (int) (number % Math.pow(10, length - 1));

        result[quotient] += 1;

        if (length == 1) {
            return 1;
        }
        return getRemainder(remainder, --length);
    }
}
