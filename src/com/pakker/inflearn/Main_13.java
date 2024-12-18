package com.pakker.inflearn;

import java.util.*;
public class Main_13 {

    public ArrayList<Integer> solution(int n, Integer[] a1, int m, Integer[] a2) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i=0; i<n ; i++) {
            for (int j=0; j<m ; j++) {
                if(a1[i] == a2[j]){
                    result.add(a1[i]);
                }
            }
        }

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a1 = new Integer[n];
        sc.nextLine();
        for (int i=0; i<n ; i++) {
            a1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        Integer[] a2 = new Integer[m];
        sc.nextLine();
        for (int i=0; i<m ; i++) {
            a2[i] = sc.nextInt();
        }

        Main_13 main = new Main_13();
        ArrayList<Integer> result = main.solution(n, a1, m, a2);
        for (Integer a : result ) {
            System.out.print( a + " ");
        }
    }
}
