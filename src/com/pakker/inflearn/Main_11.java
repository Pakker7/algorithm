package com.pakker.inflearn;

import java.util.Scanner;

public class Main_11 {
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;
        for (int i = 1; i <= n; i++) { // 멘토 후보
            for (int j = 1; j <= n; j++) { // 멘티 후보
                if (i == j) continue; // 멘토와 멘티가 같으면 제외

                int cnt = 0;
                for (int k = 0; k < m; k++) { // 각 시험에 대해 비교
                    int pi = -1, pj = -1;
                    for (int s = 0; s < n; s++) { // 등수 비교
                        if (arr[k][s] == i) pi = s;
                        if (arr[k][s] == j) pj = s;
                    }
                    if (pi < pj) cnt++; // 멘토가 멘티보다 항상 앞서야 함
                }
                if (cnt == m) answer++; // 모든 시험에서 멘토가 앞섰다면 경우 추가
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 학생 수
        int m = sc.nextInt(); // 시험 횟수
        int[][] data = new int[m][n]; // 시험 데이터
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                data[i][j] = sc.nextInt();
            }
        }

        Main_11 main = new Main_11();
        System.out.println(main.solution(n, m, data));
    }
}
