package com.pakker.inflearn;

import java.util.*;
public class Main_19 {

    public int solution(int n) {
        int result = 0;

        for (int i=1; i<n; i++) {
            int a = 0;
            for (int j=i; j<n; j++) {
                a+=j;
                if (a>n) {
                    break;
                } else if (a==n) {
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
        Main_19 main = new Main_19();
        System.out.println(main.solution(n));
    }
}
