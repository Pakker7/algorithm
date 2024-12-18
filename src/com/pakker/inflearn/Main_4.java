package com.pakker.inflearn;

import java.util.Scanner;

public class Main_4 {

    public static String solution(String strLength, String str) {
        String result = "";

        for (int i = 0 ; i < Integer.parseInt(strLength) ; i++ ) {
            String aa = str.substring(i*7, (i+1)*7);
            String aaa = aa.replaceAll("[#]","1").replaceAll("[*]","0");
            int num = Integer.parseInt(aaa, 2);
            result += (char) num;
        }
        return result;
    }


    public static void main(String[] args) {
        Main_4 main = new Main_4();
        Scanner sc = new Scanner (System.in);
        String strLength = sc.nextLine();
        String str = sc.nextLine();
        System.out.println(main.solution(strLength, str));
    }
}
