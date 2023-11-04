package com.pakker.dongbin;

//구현 문제 완전탐색
//시각
// 00시 00분 00초 ~ N시 59분 59초까지의 모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 출력하라
// ex. 5 -> 11475
// 완전 탐색 문제 -> 모든 경우의 수를 뽑아내는 문제
public class Question12 {

    public int solution(int n) {
        // 59
        // 03 13 23 33 43 53
        // 30 31 32 33 34 35 36 37 38 39

        int secCnt = 0;
        for (int z = 0; z < n+1; z++) {
            for (int j = 0; j < 60; j++) {
                for (int i = 0; i < 60; i++) {
                    String tmp = String.valueOf(z)+ String.valueOf(j) +String.valueOf(i);
                    if (tmp.indexOf("3") != -1) {
                        secCnt++;
                    }
                }
            }
        }

        return secCnt;

    }
    public static void main(String[] args) {
        Question12 question12 = new Question12();
        System.out.println(question12.solution(5)); //답은 11475
    }
}
