package com.pakker.inflearn;

// 만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면 // 20 12 20 10 23 17 10
// 첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
//두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
//세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
//네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.

// 매출액의 종류 구하기 , 슬라이딩 윈도우 기법 사용
// 1. 데이터를 받는다
// 2. for문 만들어서 data[i]는 add하고 data [i-k]는 뺀다.
// 3. 그리고 그 안에서 data[i]를 for문을 돌려서
import java.util.*;

public class Main_24 {
    public void solution(int n, int k, int[] salesAry) {
        HashMap<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            // 현재 값을 맵에 추가
            map.put(salesAry[i], map.getOrDefault(salesAry[i], 0) + 1);

            // 윈도우 크기가 k 이상이 되면 왼쪽 값 제거
            if (i >= k) {
                int leftValue = salesAry[i - k];
                if (map.get(leftValue) == 1) {
                    map.remove(leftValue);
                } else {
                    map.put(leftValue, map.get(leftValue) - 1);
                }
            }

            // 윈도우가 k 크기일 때 결과 추가
            if (i >= k - 1) {
                sb.append(map.size()).append(" ");
            }
        }

        // 결과 출력
        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 일
        int k = sc.nextInt(); // 연속된 일수
        int[] salesAry = new int[n];
        for (int i = 0; i < n; i++) {
            salesAry[i] = sc.nextInt();
        }

        Main_24 main = new Main_24();
        main.solution(n, k, salesAry);
    }
}
