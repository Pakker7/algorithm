package com.pakker.programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/160586
public class Question07 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int i=0; i<targets.length; i++) {
            String[] target = targets[i].split(""); //ex. ASA
            int clickSum = 0;

            for (int j=0; j<target.length; j++) {  //ex. target[j] => A / S / A
                int click = -1;
                for (int z=0; z<keymap.length; z++) {
                    int index = keymap[z].indexOf(target[j]);
                    index = (index != -1) ? index+1 : index;
                    if (index != -1) {
                        click = index;
                    }
                }
                if (click == -1) {
                    clickSum = -1;
                    break;
                } else {
                    clickSum += click;
                }
            }
            answer[i] = clickSum;
        }
        return answer;
    }

    public static void main(String[] args) {
        Question07 question07 = new Question07();

        System.out.println("기대 값 : [9, 4] 실제 값 :" + Arrays.stream(question07.solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD", "AABB"})).boxed().collect(Collectors.toList()));
        System.out.println("기대 값 : [-1] 실제 값 :" + Arrays.stream(question07.solution(new String[]{"AA"}, new String[]{"B"})).boxed().collect(Collectors.toList()));
        System.out.println("기대 값 : [4, 6] 실제 값 :" + Arrays.stream(question07.solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA","BGZ"})).boxed().collect(Collectors.toList()));
        System.out.println("기대 값 : [1] 실제 값 :" + Arrays.stream(question07.solution(new String[]{"A", "AB", "B"}, new String[]{"B"})).boxed().collect(Collectors.toList()));
    }
}
