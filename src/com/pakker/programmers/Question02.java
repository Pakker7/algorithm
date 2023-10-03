package com.pakker.programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/147355
public class Question02 {

    public int solution(String t, String p) {
        int tSize = t.length();
        int pSize = p.length();
        int answer = 0;

        // System.out.println("tSize-pSize : " + Integer.toString(tSize-pSize));
        for (int i = 0; i <= tSize - pSize; i++) {
            if (Long.parseLong(t.substring(i, i + pSize)) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Question02 question02 = new Question02();
        int solution = question02.solution("3141592", "271");
        System.out.println(1 + " : " + solution);

        int solution2 = question02.solution("500220839878", "7");
        System.out.println(2 + " : " + solution2);
    }
}
