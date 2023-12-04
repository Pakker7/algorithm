package com.pakker.dongbin;

import java.util.*;
//https://www.youtube.com/watch?v=7C9RgOcvkvo&list=PLRx0vPvlEmdAghTr5mXQxGpHjWqSz0dgC&index=3
// 미로탈출

/*
5 6
101010
111111
000001
111111
111111
 */

public class Question21 {

    public static int n, m;
    public static int[][] graph = new int[1000][1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N,M을 공백을 기준으로 구분하여 입력 밭기
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기

        // 2차원 리스트의 맵 정보 입력 받기
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0'; // 위치의 실제 int 값을 가져오기 위함
            }
        }

        // 미로탈출하기

    }
}
