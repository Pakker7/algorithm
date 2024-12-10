package com.pakker.inflearn;

import java.util.*;
public class Main_9 {

    public int solution(int n, int c, int[][] data) {
        // n : 몇명인지
        // c : 시험을 몇번 치는지
        // data : 시험 결과

        int cnt = 0;

        for (int i=1; i<=n ; i++){
            for (int j =1; j<=n ; j++){
                if(i==j) {
                    continue;
                }
                System.out.println(i + "번 학생과 " + j +"번 학생의 비교");

                boolean allWin = false;
                for (int k =1; k<=c ; k++) {
                    System.out.println(i + "번 학생의 "+ k+"번 시험과" + j +"번 학생의" + k+"번 시험을 비교");
                    System.out.println("data[k][i] : " + data[k][i] + ", data[k][j]" + data[k][j]);
                    if (data[k][i] < data[k][j]) {
                        allWin = true;
                    } else {
                        allWin = false;
                        break;
                    }
                }


                if (allWin){
                    System.out.println("TRUE :: " );
                    cnt++;
                }

                System.out.println("");

            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //몇명인지
        int c = sc.nextInt(); //시험을 몇번 치는지
        int[][] data = new int[c+1][n+1];
        for (int i = 1; i <= c; i++) {
            for (int j =1; j <= n; j++) {
                data[i][j] = sc.nextInt();
            }
        }

        Main_9 main = new Main_9();
        System.out.println(main.solution(n, c, data));

    }
}
