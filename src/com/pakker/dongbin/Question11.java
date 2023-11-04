package com.pakker.dongbin;

// 구현 문제
// 풀이를 떠올리는 것은 쉽지만 소스코드로 옮기기 어려운 것을 뜻한다.
// 구현 문제 예시 )
    // 알고리즘은 간단한데 실제 코드가 엄청나게 길어지는 거
    // 실수 연산을 다루고, 특정 소수점 까지 출력해야 되는 문제
    // 문자열을 특정한 기준에 따라 끊어 처리해야 되는 문제
    // 적절한 라이브러리를 찾아서 사용해야 되는 문제

// 행렬 문제
// 상하좌우
public class Question11 {

    public int[] solution(int n, String location) {

        //동 북 서 남
        int[] dx = new int[]{0, -1, 0, 1};
        int[] dy = new int[]{1, 0, -1, 0};

        int x = 1;
        int y = 1;

        // R 동, L 서 , U 북, D 남
        for (int i = 0; i < location.length(); i++) {
            int lo;
            String nowLo = location.substring(i,i+1);
             if (nowLo.equals("R")) { lo = 0;}
            else if (nowLo.equals("U")) {  lo = 1;}
            else if (nowLo.equals("L")) {  lo = 2;}
            else { lo = 3; }

            int tmpx = x + dx[lo];
            int tmpy = y + dy[lo];
            if (tmpx > n || tmpy > n || tmpx==0 || tmpy==0) {
                continue;
            }
            x = tmpx;
            y = tmpy;
        }
        return new int[]{x, y};
    }

    public static void main(String[] args) {
        Question11 question11 = new Question11();
        int[] aa = question11.solution(5 , "RRRUDD");
        System.out.println(aa[0]);
        System.out.println(aa[1]);
    }

}
