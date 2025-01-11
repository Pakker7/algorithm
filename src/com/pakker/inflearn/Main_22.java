package com.pakker.inflearn;

import java.util.*;
public class Main_22 {


    // 1. 데이터를 받는다
    // 2. dataA : hash를 이용해서 A,1 이런식으로 데이터를 넣는다.
    // --> map.get 해서 null이면 put(A,1) 넣어준다.
    // 3. dataB : 동일하게 진행
    // 4. A keySet 얻어서 for문 돌려서 B것도 가져와서 비교하기
    public String solution(String[] dataA, String[] dataB) {
        String result = "YES";

        HashMap<String, Integer> mapA = new HashMap<>();
        for (int i=0; i< dataA.length; i++) {
            String alphabet = dataA[i];
            mapA.get(alphabet);
//            if () {
//                // ... 생략
//            }
        }
        Set<String> setA = mapA.keySet();
        for (String key : setA) {
            // 생략..
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dataA = sc.nextLine().split("");
        String[] dataB = sc.nextLine().split("");
        Main_22 main = new Main_22();
        main.solution(dataA, dataB);


    }
}
