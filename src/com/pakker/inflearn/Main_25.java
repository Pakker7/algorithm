package com.pakker.inflearn;

// 아나그램 찾기 슬라이딩 윈도우 left 2 right4
//String[] S bacaAacba
//String T abc
import java.util.*;
public class Main_25 {
    public int solution(String S, String[] T) {
        // right는 하나씩 커진다. for문 int right
        // left는 T.legnth 이상 부터 하나씩 커진다.
        // 안에서 for문을 돈다. left ~ right 데이터 까지 돈다 --> 얘가 있는지 확인 해야됨
        // for문을 돌 때 T[n] indexof == -1 이면 break;하고 아니면 다음 진행을 한다. 전부다 맞으면 cnt ++ 하기
        int result = 0;
        int left = 0;

        for (int right = 0; right<S.length(); right++) {
            if (T.length > right+1) { // 3  0,1,2
                continue;
            }
            if (T.length < right+1) {
                left++;
            }
            boolean isCorrect = true;
            String tmp = S.substring(left,right+1);
            for (int j=0; j<T.length; j++) {
                if (tmp.indexOf(T[j]) == -1 ) {
                    isCorrect = false;
                }
            }

            if (isCorrect) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] T = sc.nextLine().split("");
        Main_25 main = new Main_25();
        System.out.println(main.solution(S,T));
    }
}
