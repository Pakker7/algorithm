package com.pakker.inflearn;

import java.util.*;

public class Main {

    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        // 출력할 데이터로 list를 만든다
        result.add(arr[0]);
        for (int i=1; i<n; i++) {
            if(arr[i]> arr[i-1]) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0 ; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int aa : main.solution(n, arr)) {
            System.out.print(aa + " ");
        }
    }
}
