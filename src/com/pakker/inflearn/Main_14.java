package com.pakker.inflearn;

import java.util.*;

public class Main_14 {

    public ArrayList<Integer> solution(int n, Integer[] a1, int m, Integer[] a2) {
        ArrayList<Integer> result = new ArrayList<>();

        HashSet<Integer> ha1 = new HashSet<>();
        for (Integer tmp : a1) {
            ha1.add(tmp);
        }

        for (Integer tmp : a2) {
            if (ha1.contains(tmp)) {
                result.add(tmp);
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

        Main_14 main = new Main_14();
        ArrayList<Integer> result = main.solution(n, a1, m, a2);
        for (Integer a : result ) {
            System.out.print( a + " ");
        }
    }
}
