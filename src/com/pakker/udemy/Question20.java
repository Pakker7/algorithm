package com.pakker.udemy;
import java.util.*;
//https://www.acmicpc.net/problem/2178 미로찾기 bfs 문제
/*
4 6
101111
101010
101011
111011
 */
public class Question20 {

    public static int n,m;
    public static int[][] graph = new int[100][100];
                            // 북 남 동 서
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static int bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x,y));

        while(!q.isEmpty()){
            Node node = q.poll();
            x = node.getX();
            y = node.getY();

            for (int i=0;i<dx.length;i++) {
                int nx = x + dx[i]; // 왜 더하지?
                int ny = y + dy[i];
                //공간 벗어나면 continue;
                if (nx < 0||nx>=n||ny<0||ny>=m) { continue; }
                //이동 못하면 continue;
                if (graph[nx][ny] == 0) { continue; }
                // 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
                if (graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y]+1;
                    q.offer(new Node(nx,ny));
                }
            }
        }
        return graph[n-1][m-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기

        for(int i=0; i<n; i++ ) {
            String str = sc.nextLine();
            for (int j=0; j<m; j++) {
                graph[i][j] = str.charAt(j)-'0'; // 위치의 실제 int값을 가져오기 위해 -0함
            }
        }

        System.out.println(bfs(0,0));
    }
}

class Node {
    private int x;
    private int y;
    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {return this.x;}
    public int getY() {return this.y;}
}