package com.pakker.part5;

import java.util.Scanner;

public class Question02 {

    //https://www.acmicpc.net/problem/2562
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int maxIndex = 0;
        int max = 0;
        while (i < 9) {
            int n = scanner.nextInt();
            if (n > max) {
                max = n;
                maxIndex = i;
            }
            i++;
        }

        System.out.println(max);
        System.out.println(maxIndex + 1);

        //1차
//        Scanner scanner = new Scanner(System.in);
//        int size = 9;
//        int[] array = new int[size];
//        int i = 0;
//        while (i < size) {
//            array[i++] = scanner.nextInt();
//        }
//
//        int[] originArray = array.clone();
//        Arrays.sort(array);
//
//        for (int a = 0; a < originArray.length; a++) {
//            if (originArray[a] == array[size - 1]) {
//                System.out.println(array[size - 1]);
//                System.out.println(a + 1);
//                break;
//            }
//        }
    }
}
