package com.pakker.dongbin;

//https://www.youtube.com/watch?v=2zjoKjt97vQ&list=PLRx0vPvlEmdAghTr5mXQxGpHjWqSz0dgC&index=2
// 그리디

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// 모험가 길드
// 최대 몇개의 모험가 그룹에 참여해야 여행을 떠날 수 있는지?
// --> 오름차순 정렬
public class Question10_1 {

    public int solution(int n, int[] fear) {
        int result = 0; //group cnt
        List<Integer> group = new ArrayList<>();

        Arrays.sort(fear);
        for (int i = 0; i < fear.length; i++) {
//            System.out.println(fear[i]);

            // 그룹에 넣는 작업
            group.add(fear[i]);

            // 그룹에서 빼는 작업
            if(fear[i] <= group.size()) {
                result ++; //그룹 수 추가
                group = new ArrayList<>(); // 초기화
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Question10_1 question101 = new Question10_1();
        System.out.println(question101.solution(5, new int[]{2,3,1,2,2})); // 답 2
    }
}
