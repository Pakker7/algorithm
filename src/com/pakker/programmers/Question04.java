package com.pakker.programmers;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/135808
public class Question04 {
    public int solution(int k, int m, int[] score) {
        int boxTotalCnt = score.length/m;
        int answer = 0;
        for (int i=0; i< boxTotalCnt; i++) {
            int[] appleBox = new int[m];
            for (int j=0; j<m; j++) {
                //TODO score 배열 에서 applebox로 분리 작업 진행
            }
            int min = Arrays.stream(appleBox).min().getAsInt();
            int boxScore = min * m * boxTotalCnt;
            answer += boxScore;
        }
        return answer;
    }

    public static void main(String[] args) {
        Question04 question04 = new Question04();
        int solution1 = question04.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1});
        System.out.println(solution1 == 8);
        int solution2 = question04.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
        System.out.println(solution2 == 33);
    }
}
