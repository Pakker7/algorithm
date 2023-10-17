package com.pakker.programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/155652
public class Question08 {

    public String solution(String s, String skip, int index) { // a -> 97
        String answer = "";

        // ex. aukks
        String[] ss = s.split("");
        for (int i = 0; i < ss.length; i++) { //s의 한글자 한글자
            System.out.println(ss[i]);
            int num = Integer.valueOf(ss[i].charAt(0));
            int tmpIndex = index;
            String ones = "";
            for (int j = 1; j <= tmpIndex; j++) { //index 갯수 만큼 하나씩 뒤로 미루면서 skip있는지 확인..
                int tmp = (num + j);
                tmp = cal(tmp);
                char cha = (char) tmp;
                ones = String.valueOf(cha);
                if (skip.indexOf(cha) != -1) {  //skip 단어에 cha가 포함되면 for 문 한번씩 더 돌림..
                    tmpIndex++;
                }
            }
            answer = answer + ones;
        }
        return answer;
    }
    private static int cal(int aa) {
        if (aa < 123  && aa > 96) {
            return aa;
        } else if ((aa % 122) + 96 > 122){
            return cal((aa % 122) + 96);
        } else {
            return (aa % 122) + 96;
        }

    }

    public static void main(String[] args) { // A -> 65 / a -> 97
        Question08 question08 = new Question08();
        System.out.println("기대 값 : happy : 실제 값 " + question08.solution("aukks", "wbqd", 5));


        int aa = 97;
        int aa2 = 122; // z
        int aa3 = 123; // a
        int aa4 = 124; // b
        int aa5 = 352354525; // b

        System.out.println((char)97);
        System.out.println("aa : " + (char)cal(aa) + ", :원래 값 : " + cal(aa));
        System.out.println("aa2 : " + (char)cal(aa2) + ", :원래 값 : " + cal(aa2));
        System.out.println("aa3 : " + (char)cal(aa3) + ", :원래 값 : " + cal(aa3));
        System.out.println("aa4 : " + (char)cal(aa4) + ", :원래 값 : " + cal(aa4));
        System.out.println("aa5 : " + (char)cal(aa5) + ", :원래 값 : " + cal(aa5));

    }

}
