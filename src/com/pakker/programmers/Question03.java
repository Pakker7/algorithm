package com.pakker.programmers;

import java.util.LinkedHashMap;

//https://school.programmers.co.kr/learn/courses/30/lessons/142086
public class Question03 {
    public int[] solution(String s) {
        String[] sArray = s.split("");
        int[] answer = new int[sArray.length];
        for (int i = 0; i < sArray.length; i++) {
            String tmpString = s.substring(0, i);
            int lastIndexOf = tmpString.lastIndexOf(sArray[i]);
            if(lastIndexOf == -1 || i == lastIndexOf) {
                answer[i] = -1;
            } else {
                answer[i] = tmpString.length() - lastIndexOf;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Question03 ques = new Question03();
        int[] bananas = ques.solution("banana");
        for (int aa : bananas) {
            System.out.print(aa + ", ");
        }

        System.out.println(bananas.equals(new int[]{-1, -1, -1, 2, 2, 2}));

//        int[] foobars = ques.solution("foobar");
//        for (int aa : foobars) {
//            System.out.print(aa + ", ");
//        }
//
//        System.out.println(foobars.equals(new int[]{-1, -1, 1, -1, -1, -1}));
    }


//    public int[] solution(String s) {
//        String[] sArray = s.split("");
//        int[] answer = new int[sArray.length];
//        for (int i = 0; i < sArray.length; i++) {
//            answer[i] = -1;
//        }
//
//        for (int i = 0; i < sArray.length; i++) {
//
//            System.out.println("i : " + i + ", sArray[i] : " + sArray[i]);
//
//            int cnt = 0;
//            for (int j = i; j != 0; j--) {
//
//                System.out.println("i:" + i + ",j:" + j + ", sArray[i], [j]:" + sArray[i] + "," + sArray[j]);
//
//                if (i!=j && sArray[i].equals(sArray[j])) {
//                    System.out.println("sArray[i].equals(sArray[j]) 입니다");
//                    answer[i] = cnt;
//                    break;
//                }
//                cnt++;
//            }
//            System.out.println("");
//        }
//
//        return answer;
//    }
}
