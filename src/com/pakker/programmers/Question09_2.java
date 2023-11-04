package com.pakker.programmers;
//(이코테 2021 강의 몰아보기) 2. 그리디 & 구현
// 그리디

public class Question09_2 {
    public int solution(String str) {
        int result = str.charAt(0) - '0';
        for (int i = 1; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            if (num <= 1 || result <= 1) {
                result = result + num;
            } else {
                result = result * num;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Question09_1 aa = new Question09_1();
        System.out.println(aa.solution("02984")); // 답은 576
        System.out.println(aa.solution("567")); // 답은 210
        String bb = "093857";
        long longg = bb.charAt(0);  // 결과 48
        long longg2 = bb.charAt(0) - '0'; // 결과 0
        System.out.println(longg);
        System.out.println(longg2);

        // chatAt(0) 으로 0을 출력 시 아스키 코드인 48이 반환된다.
        // 따라서 - '0' 을 하면 아스키 코드 값이 빼지고 따라서 0이 출력된다.
        // Question09_1 는 Integer.parseInt도 있고 변수(tmp) 생성하기 때문에 Question09_2가 더 효율적이다.
    }
}
