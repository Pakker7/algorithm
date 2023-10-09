package com.pakker.programmers;

import java.sql.SQLOutput;

//https://school.programmers.co.kr/learn/courses/30/lessons/136798
public class Question06 {

    // number : 기사 단원의 수
    // limit : 제한수치
    // power : 제한수치를 초과한 기사가 사용할 무기의 공격력을 나타냄
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int divisorCnt = 0;

        for (int i=1; i<=number; i++) {
            int sqrt = (int) Math.sqrt(i); // 제곱근 구하기
            for (int j=1; j<=sqrt; j++) {
                if (j*j == i) { // 중복 약수 이슈..
                    divisorCnt++;
                } else if ( i%j==0 ) {
                    divisorCnt += 2;
                }
            }

            if (divisorCnt <= limit) {
                 answer += divisorCnt;
             } else {
                 answer += power;
             }

            System.out.println(i + "의 약수의 갯수 : " + divisorCnt);
            divisorCnt =0;
        }

        return answer ;
    }

    public static void main(String[] args) {
        Question06 question06 = new Question06();
        System.out.println("기댓 값 : 10, 실제 값 : " + question06.solution(5, 3, 2));
        System.out.println("");
        System.out.println("기댓 값 : 21, 실제 값 : " + question06.solution(10, 3, 2));
    }

}
