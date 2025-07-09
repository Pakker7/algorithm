package com.pakker.grok;

//주어진 문자열 s에서 특정 문자 ch가 몇 번 등장하는지 세는 함수를 작성하세요.
//
//        입력: 문자열 s (영어 소문자로만 구성), 문자 ch (영어 소문자)
//        출력: 문자 ch가 문자열 s에서 등장한 횟수 (정수)
//        예시:
//        입력: s = "banana", ch = 'a' → 출력: 3
//        입력: s = "hello", ch = 'l' → 출력: 2
//        입력: s = "world", ch = 'z' → 출력: 0
//        제한사항
//
//        문자열 s의 길이는 1 이상 100 이하입니다.
//        ch는 항상 소문자 영어 알파벳 하나입니다.
public class Main_1 {
    public int Solution(String s, char ch) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) { // 문자열을 처음부터 끝까지 순회
            if (s.charAt(i) == ch) { // 현재 문자가 ch와 같으면
                answer++; // 카운터 증가
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main_1 main = new Main_1();
        String s = "banana";
        char ch = 'a';
        System.out.println(main.Solution(s, ch));

        s = "hello";
        ch = 'l';
        System.out.println(main.Solution(s, ch));

        s = "world";
        ch = 'z';
        System.out.println(main.Solution(s, ch));
    }
}
