package com.pakker.dongbin;

// 동빈나 왕실의 나이트
// https://www.youtube.com/watch?v=2zjoKjt97vQ&list=PLRx0vPvlEmdAghTr5mXQxGpHjWqSz0dgC&index=2
public class Question13_1 {

    // a1, b1, c1, d1, e1, f1...
    // a2, b2, c2, d2, e2, f2...
    // a3, b3, c3, d3, e3, f3...
    // a4, b4, c4, d4, e4, f4...
    // a5, b5, c5, d5, e5, f5...

    public int solution(String location) {
        int result = 0;
        //                   동 북 서 남
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};

        // 1. 수평으로 2번 이동 후 수직으로 1번 이동 --> 동동북, 동동남, 서서북, 서서남 --> 001,003,221,223
        // 2. 수평으로 1번 이동 후 수직으로 2번 이동 --> 동북북, 동남남, 서북북, 서남남 --> 011,033,211,233
        String[] caseAry = new String[]{"001","003","221","223","011","033","211","233"};
        // a=97 b=98
        int x = location.substring(0,1).charAt(0);
        int y = Integer.parseInt(location.substring(1,2));

        for (int i = 0; i < caseAry.length; i++) {
            String[] caseTmp = caseAry[i].split("");

            int xx = x;
            int yy = y;

            boolean isTrue = true;
            for (int j = 0; j < caseTmp.length; j++) {
                int lo = Integer.parseInt(caseTmp[j]);
                int tmpx = xx + dx[lo];
                int tmpy = yy + dy[lo];
                if (tmpx > "h".charAt(0) ||tmpx < "a".charAt(0) || tmpy > 8 ||tmpy < 1) {
                    isTrue=false;
                    break;
                }
                xx = tmpx;
                yy = tmpy;
            }

            if (isTrue) {
                result++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Question13_1 question13 = new Question13_1();
        System.out.println(question13.solution("c2")); // 답은 6
        System.out.println(question13.solution("a1")); // 답은 2

    }
}
