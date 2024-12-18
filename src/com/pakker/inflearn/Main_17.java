package com.pakker.inflearn;

import java.util.*;
public class Main_17 {
        //맞는거 같은데 답이 아니라고 함 다시 풀기
        //https://cote.inflearn.com/contest/10/problem/03-04
    public int solution(int n, int m, Integer[] array) {
        int result =0;
        int addVal = 0 ;
        int standardIdx = 0;
        //슬라이딩? 기법 사용
        for (int i=0; i<n ; i++) {
            if (i+1 >= n) {
                break;
            }
            addVal += array[i]; // 더해준다.
            if (addVal > m) {
                addVal -= array[standardIdx];
                standardIdx++;
            }

            if (addVal == m) {
                System.out.println(">> " + i+"번째임, 값 : " + array[i]);
                result++;

            }

        }

        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(); // 몇개의 수인지?
        int m =sc.nextInt(); // 합이 m이 되는 값
        sc.nextLine();

        Integer[] array = new Integer[n];
        for (int i=0; i<n ; i++){
            array[i] = sc.nextInt();
        }
        Main_17 main = new Main_17();
        System.out.println(main.solution(n, m, array));

    }
}
