package com.pakker.inflearn;

import java.util.Scanner;
11 다시하기..
public class Main_7 {

    public int solution(int[][] data, int totalN) {
        int[] sameClassCnt = new int[totalN + 1]; // 학생별 같은 반 수 카운트
        int result = 0; // 임시 반장 후보
        int max = 0; // 최대 같은 반 수

        for (int n = 1; n <= totalN; n++) { // 기준 학생
            for (int j = 1; j <= 5; j++) { // 학년
                for (int i = 1; i <= totalN; i++) { // 비교 학생
                    if (n != i && data[n][j] == data[i][j]) { // 같은 반이면
                        sameClassCnt[n]++;
                        break; // 같은 학년에서는 한 번만 카운트
                    }
                }
            }

            // 최대 같은 반 수 및 임시 반장 결정
            if (sameClassCnt[n] > max) {
                max = sameClassCnt[n];
                result = n;
            } else if (sameClassCnt[n] == max) { // 같은 최대값이면 번호가 작은 학생 선택
                if (n < result) result = n;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main_7 main = new Main_7();
        Scanner sc = new Scanner(System.in);

        int totalN = sc.nextInt(); // 학생 수
        int[][] data = new int[totalN + 1][6]; // 학생 번호 1~totalN, 학년 1~5

        for (int i = 1; i <= totalN; i++) {
            for (int j = 1; j <= 5; j++) {
                data[i][j] = sc.nextInt();
            }
        }

        System.out.println(main.solution(data, totalN));
    }
}

