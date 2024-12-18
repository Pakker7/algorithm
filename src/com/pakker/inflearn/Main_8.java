package com.pakker.inflearn;

import java.util.*;

public class Main_8 {
//List<Set<String>>
    //1번학생 Set<> x
    //2번학생 Set<> 4번
    //3번학생 Set<> 4번, 5번
    //4번학생 Set<> 3번, 5번, 2번,
    //5번학생 Set<> 3번, 4번

    public int solution(int[][] data, int totalN) {
        int answer = 0 ;
        int max = Integer.MIN_VALUE;
        for (int i =1; i <= totalN ; i ++) { // i반 학생
            int cnt = 0;
            for (int j=1; j<= totalN; j++) { // j반 학생
                for (int k=1; k<= 5 ; k++) { // 비교값
                    if (data[i][k] == data[j][k]) {
                        cnt++;
                        break; //한번씩만 계산
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main_8 main = new Main_8();
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
