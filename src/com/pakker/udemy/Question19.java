package com.pakker.udemy;

//https://www.acmicpc.net/problem/11724
// 방향 없는 그래프가 주어졌을 때, 연결 요소 (Connected Component)의 개수를 구하는 프로그램을 작성하시오.
// 첫째 줄에 정점의 개수 N과 간선의 개수 M이 주어진다. (1 ≤ N ≤ 1,000, 0 ≤ M ≤ N×(N-1)/2) 둘째 줄부터 M개의 줄에 간선의 양 끝점 u와 v가 주어진다. (1 ≤ u, v ≤ N, u ≠ v) 같은 간선은 한 번만 주어진다.
// ex.1
// input
//6 5
//1 2
//2 5
//5 1
//3 4
//4 6

// output
// 2

import java.util.*;

public class Question19 {

    public static int n,m;
    public static int[] graph= new int[]{};
    public static boolean[] visited = new boolean[]{};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N, M을 공백을 기준으로 구분하여 입력 받기
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기

        visited = new boolean[n];

        // 2차원 리스트의 맵 정보 입력 받기
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            graph[i] = str.charAt(i) - '0';
        }

        for() {

        }

    }
}
