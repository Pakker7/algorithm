package com.pakker.inflearn;

import java.util.*;

public class Main_12 {

    public Integer[] solution (int n, Integer[] array1, int m, Integer[] array2) {

        int a1 = 0;
        int a2 = 0;
        Integer[] result = new Integer[m+n];
        for (int i=0; i < n+m ; i++) {
            if (a1 >= n) {
                result[i] = array2[a2];
                a2++;
            } else if (a2 >= m) {
                result[i] = array1[a1];
                a1++;
            } else if ( array1[a1] <= array2[a2]) {
                result[i] = array1[a1];
                a1++;
            } else if ( array1[a1] > array2[a2]) {
                result[i] = array2[a2];
                a2++;
            }

        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        sc.nextLine();
        Integer[] array1 = new Integer[n];
        for (int i=0; i<n ; i++){
            array1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        sc.nextLine();
        Integer[] array2 = new Integer[m];
        for (int i=0; i<m ; i++){
            array2[i] = sc.nextInt();
        }

        Main_12 main = new Main_12();
        Integer[] result = main.solution(n, array1, m, array2);

        for (Integer a : result) {
            System.out.print(a + " ");
        }

    }
}
