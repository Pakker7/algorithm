package com.pakker.grok;
import java.util.*;
//주어진 문자열 s에서 중복된 문자를 제거하고, 남은 문자들을 원래 순서대로 유지한 새로운 문자열을 반환하세요.
//        입력: 문자열 s (영어 소문자로만 구성)
//        출력: 중복이 제거된 문자열
//        예시:
//        입력: s = "banana" → 출력: "ban"
//        입력: s = "hello" → 출력: "helo"
//        입력: s = "aaaa" → 출력: "a"
//        제한사항
//
//        문자열 s의 길이는 1 이상 100 이하입니다.
//        s는 영어 소문자로만 구성됩니다.
public class Main_3 {
    public String Solution(String s) {
        String answer = "";
        String[] sAry = s.split("");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        for(int i=0; i<sAry.length; i++) {
            map.put(sAry[i],"");
        }
        for(String a : map.keySet()) {
            answer+=a;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main_3  main = new Main_3 ();
        String s = "banana";
        System.out.println(main.Solution(s));
    }
}