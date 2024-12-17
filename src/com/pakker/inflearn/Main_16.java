package com.pakker.inflearn;

import java.util.Scanner;

public class Main_16 {

    public int solution(int n, int k, Integer[] array) {
        int max = 0;
        int addVal = 0;

        // 슬라이딩 윈도우 기법? 사용하기
        for (int i=0; i<n ; i++) {
            if (i-k >= 0) {
                addVal -= array[i-k];
            }
            if (i+k < n) {
                addVal += array[i];
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

        Main_16 main = new Main_16();
        System.out.println(main.solution(n, k, array));

    }
}
