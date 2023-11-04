package com.pakker.dongbin;

import java.util.HashSet;
import java.util.Set;

// 동빈나 왕실의 나이트
// https://www.youtube.com/watch?v=2zjoKjt97vQ&list=PLRx0vPvlEmdAghTr5mXQxGpHjWqSz0dgC&index=2
// 48:16 푸는중
public class Question13 {

    // a1, b1, c1, d1, e1, f1...
    // a2, b2, c2, d2, e2, f2...
    // a3, b3, c3, d3, e3, f3...
    // a4, b4, c4, d4, e4, f4...
    // a5, b5, c5, d5, e5, f5...

    public int solution(String location) {
        Set set = new HashSet<>();
        //                   동 북 서 남
        int[] dx = new int[]{1, 0,-1, 0};
        int[] dy = new int[]{0,-1, 0, 1};

        // 1. 수평으로 2번 이동 후 수직으로 1번 이동 --> 동동북, 동동남, 서서북, 서서남 --> 001,003,221,223
        // 2. 수평으로 1번 이동 후 수직으로 2번 이동 --> 동북북, 동남남, 서북북, 서남남 --> 011,033,211,233
        String[] caseAry = new String[]{"001","003","221","223","011","033","211","233"};
        // a=97 b=98
        int x = location.substring(0,1).charAt(0);
        int y = Integer.parseInt(location.substring(1,1));

        for (int i = 0; i < caseAry.length; i++) {
            String[] caseTmp = caseAry[i].split("");

            int xx = 0;
            int yy = 0;

            boolean isTrue = true;
            for (int j = 0; j < caseTmp.length; j++) {
                int lo = Integer.parseInt(caseTmp[i]);
                int tmpx = x + dx[lo];
                int tmpy = y + dy[lo];

                if (tmpx >= 8 || tmpy >= "h".charAt(0)) {
                    isTrue=false;
                    break;
                }
                xx = tmpx;
                yy = tmpy;
            }

            if (isTrue) {
                set.add( (char)xx + yy);
            }
        }

        return set.size();
    }
    public static void main(String[] args) {
        Question13 question13 = new Question13();
        System.out.println(question13.solution("c2")); // 답은 6
        System.out.println(question13.solution("a1")); // 답은 2

//        long aa = "a".charAt(0);
//        System.out.println(aa);
//        char bb = (char)aa;
//        System.out.println(bb);
    }
}
