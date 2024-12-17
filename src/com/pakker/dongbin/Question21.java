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

    //이동할 네가지 방향 정의
    public static int dx[]={-1, 1, 0, 0};
    public static int dy[]={0, 0, -1, 1};

    public static int bfs(int x, int y){
        Queue<Node> q = new LinkedList<>();//linkedList로 구현
        q.offer(new Node(x,y));

        //큐가 빌때까지 반복하기
        while(!q.isEmpty()) {
            Node node = q.poll();
            x = node.getX() ;
            y = node.getY() ;

            //현재 위치에서 4가지 방향으로의 위치 확인
            for(int i =0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                //미로 찾기 공간을 벗어난 경우 무시
                if(nx < 0 || nx >=n || ny <0 | ny>=m) {
                    continue;
                }
                // 벽인 경우 무시
                if(graph[nx][ny] == 0) {
                    continue;
                }
                // 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
                if(graph[nx][ny] ==1) {
                    graph[nx][ny] = graph[x][y]+1;
                    q.offer(new Node(nx, ny));

                }
            }
        }
        return graph[n-1][m-1];
    }

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

        // 미로탈출하기 결과 출력
        System.out.println(bfs(0,0));

    }

}

class Node{
    private int x;
    private int y;
    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }
    public int getY() {
        return this.y;
    }
}