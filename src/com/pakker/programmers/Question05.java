package com.pakker.programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/159994
public class Question05 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int maxLength = cards1.length + cards2.length;
        int cards1Index = 0;
        int cards2Index = 0;
        for (int i=0; i<maxLength; i++) {
            if (goal.length <= i) {
                break;
            }

            if (cards1Index < cards1.length && goal[i].equals(cards1[cards1Index])) {
                cards1Index++;

            } else if (cards2Index < cards2.length && goal[i].equals(cards2[cards2Index])) {
                cards2Index++;

            } else {
                answer = "No";
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Question05 question05 = new Question05();
//        System.out.println("want result : Yes , real result : " + question05.solution(
//                new String[]{"i", "drink", "water"},
//                new String[]{"want", "to"},
//                new String[]{"i", "want", "to", "drink", "water"}
//        ));
//        System.out.println("want result : No , real result : " + question05.solution(
//                new String[]{"i", "water", "drink"},
//                new String[]{"want", "to"},
//                new String[]{"i", "want", "to", "drink", "water"}
//        ));
        System.out.println("want result : Yes , real result : " + question05.solution(
                new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"},
                new String[]{"string", "or", "integer"},
                new String[]{"string", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}
        ));

    }
}
