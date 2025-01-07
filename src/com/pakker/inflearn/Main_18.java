package com.pakker.inflearn;

import java.util.*;

public class Main_18 {

    // 연속 부분 수열 1 2 1 3 1 1 1 2
    public int solution(Integer[] data, int n, int m) {
        int result = 0;

        for (int i=0; i<n; i++) {
            int a = 0;
            for (int j=i; j<n;j++) {
                a += data[j];
                if (a > m) {
                    break;
                } else if (a == m) {
                    result++;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] data = new Integer[n];
        for (int i=0; i<n; i++) {
            data[i] = sc.nextInt();
        }
        Main_18 main = new Main_18();
        System.out.println(main.solution(data, n, m));
    }

}

