package com.pakker.dongbin;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Question16 {
    //DFS : 깊이 우선 탐색
    // 1. 탐색 시작 노드를 스택에 삽입하고 방문처리를 합니다.
    // 2. 스택의 최상단 노드에 방문하지 않은 인접한 노드가 하나라도 있으면 그 노드를 스택에 넣고 방문처리합니다. 방문하지 않은 인접노드가 없으면 스택에서 최상단 노드를 꺼냅니다.
    // 3. 더이상 2번의 과정을 수행할 수 없을 때까지 반복합니다

    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    // dfs 함수 정의
    public static void dfs(int x) {
        for (int i = 0; i < graph.size(); i++) {
            System.out.println(graph.get(i));
        }

        // 현재 노드를 방문 처리
        visited[x] = true;
        System.out.println(x + " ");

        //현재 노드와 연결 된 다른 노드를 재귀적으로 방문
        for (int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if (!visited[y]) {
                dfs(y);
            }
        }

    }

    public static void main(String[] args) {

        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<Integer>());
        }

        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        graph.get(2).add(1);
        graph.get(2).add(7);

        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        graph.get(4).add(3);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);

        graph.get(6).add(7);

        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        graph.get(8).add(1);
        graph.get(8).add(7);
        dfs(1);

    }


}
