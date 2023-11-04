package com.pakker.dongbin;

//(이코테 2021 강의 몰아보기) 2. 그리디 & 구현
// 그리디
public class Question09_1 {

    public int solution(String str) {
        int result = 1;

        for (int i=0; i<str.length() ; i++) {
            int tmp = Integer.parseInt(str.substring(i,i+1));
            if (tmp <= 1) {

            } else {
                result = result * tmp;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Question09_1 aa = new Question09_1();
        System.out.println(aa.solution("02984")); // 답은 576
        System.out.println(aa.solution("567")); // 답은 210
//        String bb = "293857";
//        System.out.println(bb.substring(1,2));
    }
}
