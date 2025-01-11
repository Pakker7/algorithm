package com.pakker.inflearn;

// 만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면 // 20 12 20 10 23 17 10
// 첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
//두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
//세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
//네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.

// 매출액의 종류 구하기
// 1. 데이터를 받는다
// 2. salesAry[] 시작 index를 ++ 하면서 k개 만큼 array를 반복한다.?
// 2. left 0 rignt k 해서 둘다++ 하면서 right 가 n을 넘지 않을 때까지 반복한다?
// 2. salesAry[i] k 까지 for문돈다. 2중 for문임
// 3. i+k가 n을 넘을 때까지 반복한다. 첫번째 방복문
// 4. 두번째 반복문은 set<Integer>에 put한다. set은 알아서 중복 제거 됨
// 5. 그래서 그 set의 갯수를 출력하든가 result에 넣는다.

import java.util.*;
public class Main_23 {
    public void solution(int n, int k, int[] salesAry) {
        for (int i=0; i<n; i++) {
            if (i+k >  n) {
                break;
            }
            Set<Integer> kset = new HashSet<>();
            for (int j=i; j<k+i; j++) {
                kset.add(salesAry[j]);
            }
            System.out.print(kset.size()+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 일
        int k = sc.nextInt(); // 연속된 일수
        int[] salesAry = new int[n];
        for (int i=0; i<n; i++) {
            salesAry[i] = sc.nextInt();
        }
        Main_23 main = new Main_23();
        main.solution(n,k,salesAry);

    }
}
