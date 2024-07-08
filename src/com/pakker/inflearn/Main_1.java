package com.pakker.inflearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_1 {
    public static String solution(List<String> list) {

        ArrayList<String> ans = new ArrayList<>();
        for (String x : list) {
            char[] c = x.toCharArray();
            int lt = 0;
            int rt = c.length - 1 ;
            while ( lt < rt ) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            String t = String.valueOf(c);
            ans.add(t);
        }

        return String.valueOf(ans);
    }

    public static void main(String[] args){
        Main_1 m = new Main_1();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        List<String> list = new ArrayList<>();
        for (int i=0; n > i ; i++) {
            String word = in.next();
            list.add(word);
        }
        System.out.println(m.solution(list));
    }
}



