package com.pakker.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://school.programmers.co.kr/learn/courses/30/lessons/135808
public class Question04 {
    public int solution(int k, int m, int[] score) {
        Integer[] scoreInteger = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scoreInteger, Collections.reverseOrder());

        int answer = 0;
        for (int i=0; i< scoreInteger.length ; i++) {
            if ((i+1) % m == 0) {
                answer += (scoreInteger[i] * m );
            }
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
