package com.pakker.programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/176963
public class Question01 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        int[] answer = new int[photo.length];
        int rowInt = 0;
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                for (int z = 0; z < name.length; z++) {
                    if (photo[i][j].equals(name[z])) {
                        rowInt += yearning[z];
                    }
                }
            }
            answer[i] = rowInt;
            rowInt = 0;
        }

        return answer;
    }
}
