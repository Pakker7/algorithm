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

    public static int n, m;
    public static int[][] graph = new int[][]{};
    public static int[] visited = new int[]{};

    public static boolean dfs(int x) {
        for(int i=0; i<n; i++) {
            if(graph[x][i] == 0) {
                visited[i] =0; // 미리 체크를 해줌으로서 연산의 낭비를 방지할 수 있다.
                dfs(i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N, M을 공백을 기준으로 구분하여 입력 받기
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기

        visited = new int[n];

        // input을 2차원 배열 인접행렬로 만들기
        graph = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        // 출력
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println("");
        }


        int result = 0;
        for (int i = 0; i < n; i++) {
            if (dfs(i)) {
                result += 1;
            }
        }

        System.out.println(" result : " + result);
    }
}
