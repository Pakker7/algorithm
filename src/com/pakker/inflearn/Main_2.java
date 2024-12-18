package com.pakker.inflearn;

import java.util.Scanner;

public class Main_2 {

    public static String solution(String str) {
        char[] cArray = str.toCharArray();
        int lt = 0;
        int rt = cArray.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(cArray[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(cArray[rt])) {
                rt--;
            } else {
                char c = cArray[lt];
                cArray[lt] = cArray[rt];
                cArray[rt] = c;
                lt++;
                rt--;
            }
        }
        return String.valueOf(cArray);
    }

    public static void main(String[] args) {

        Main_2 main2 = new Main_2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(main2.solution(str));

    }
}
