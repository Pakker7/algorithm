package com.pakker.inflearn;

import java.util.*;
public class Main_15 {

    public int solution(int n, int k, Integer[] array) {
        int max = 0;

        for (int i=0; i<n ; i++) {
            int addVal = 0;
            for (int j = 0; j<k; j++) {
                if (i+j >= n) {
                    break;
                }
                addVal += array[i+j];
            }
            if (max < addVal) {
                max = addVal;
            }
        }

        return max;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //총 n일동안의 매출액
        int k = sc.nextInt(); //연속된 k일

        sc.nextLine();
        Integer[] array = new Integer[n];

        for (int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }

        Main_15 main = new Main_15();
        System.out.println(main.solution(n, k, array));

    }
}
