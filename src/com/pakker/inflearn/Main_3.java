package com.pakker.inflearn;

import java.util.*;

public class Main_3 {

    public static String solution(String str) {

        String[] array = str.split("");
        String answer = "";
        for (String aryStr : array) {
            if (!answer.contains(aryStr)) {
                answer += aryStr;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main_3 m = new Main_3();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(m.solution(str));
    }
}
