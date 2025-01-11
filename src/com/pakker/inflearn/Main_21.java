package com.pakker.inflearn;

import java.util.*;

public class Main_21 {
    public String solution(int n, String[] data) {
        String result = "";
        int resultCnt = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            String alphabet = data[i];
            Integer value = map.get(alphabet);
            if (value == null) {
                map.put(alphabet, 1);
            } else {
                map.put(alphabet, ++value);

                if (value > resultCnt) {
                    result = alphabet;
                    resultCnt = value;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String aa = sc.nextLine();
        String[] data = aa.split("");

        Main_21 main = new Main_21();
        System.out.println(main.solution(n, data));
    }
}
