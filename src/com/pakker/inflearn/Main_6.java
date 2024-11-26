package com.pakker.inflearn;

import java.util.*;
public class Main_6 {


    // 1. 데이터를 쭉 받는다
    // 2. 데이터로 배열을 만든다. ex. [0][1] = 5
    // 3. [0][0] 순서부터 시작해서 북동남서 주변의 값을 구한다.
    // 4. 북동남서 주변의 값이랑 [0][0]의 값을 비교해서 [0][0]의 값이 더 큰지 (봉우리 인지) 파악한다.
    // 5. 봉우리 라면 cnt++ 한다.
    // 6. 끝까지 돈다

    public int solution(int[][] data, int n) {

        int result = 0;

        for (int i=0; i < n ; i++) {
            for (int j=0; j < n ; j++) {
;
                int now = data[i][j];  // 해당 지점의 비교 기준 값 ex. [0][0] 의 값

                int[] dx = {-1, 0, 1, 0}; //북동남서 방향
                int[] dy = {0, -1, 0, 1}; //북동남서 방향

                int[] nesw = {0,0,0,0}; //north east south west 순서대로 배열

                // 3. [0][0] 순서부터 시작해서 북동남서 주변의 값을 구한다.
                for (int k=0 ; k<4 ; k++) {
                    int x = i + dx[k];
                    int y = j + dy[k];
                    if (x < 0 || y < 0 || x >= n || y >= n) {
                        nesw[k] = 0;
                    } else {
                        nesw[k] = data[x][y] ;
                    }
                }

                // 4. 북동남서 주변의 값이랑 [0][0]의 값을 비교해서 [0][0]의 값이 더 큰지 (봉우리 인지) 파악한다.
                if (nesw[0] < now && nesw[1] < now && nesw[2] < now && nesw[3] < now) {
                    // 5. 봉우리 라면 cnt++ 한다.
                    result ++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main_6 main = new Main_6();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] data = new int[n][n];

        for (int i=0; i<n ; i++) {
            for (int j =0; j < n; j++){
                data[i][j] = sc.nextInt(); //한개씩 받는게 되면 이렇게 하고 아니면 전체를 받아서 parsing 한다.
            }
        }
        System.out.println(main.solution(data, n));
    }
}
