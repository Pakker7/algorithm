package com.pakker.dongbin;

import java.util.Arrays;
import java.util.ArrayList;

// 구현문제 완전탐색
// 문자열 재정렬
// 알파벳 오름차순 정렬 후, 남운 모든 숫자를 더해서 출력
// ex. K1KA5CB7 -> ABCKK13
// 확인해봐야 함
public class Question14 {
    public String solution(String str) {
        String result = "";
        String[] strAry = str.split("");
        ArrayList<Integer> ary = new ArrayList<>();
        Arrays.sort(strAry);
        int sum = 0;
        for(int i=0;i<strAry.length;i++) {
            int number = strAry[i].charAt(0) - '0';
            if (number < 10 && number >= 0) {
                sum += number;
            } else {
                ary.add(i);
                result = result + strAry[i];
            }
        }
        result = result + sum;
        return result;
    }

    public static void main(String[] args) {
        Question14 question14 = new Question14();
        System.out.println(question14.solution("K1KA5CB7")); // 답은 ABCKK13
    }
}
