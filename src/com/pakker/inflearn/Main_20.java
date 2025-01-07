package com.pakker.inflearn;

import java.util.*;

public class Main_20 {
    // 0 1 2 3 4 5 6 7 8 9 10111213
    // 1 1 0 0 1 1 0 1 1 0 1 1 0 1

    // 1. right 값을 하나씩 ++ 하면서 계산을 한다.
    // 2. data[right] == 0 이면 zeroCnt를 ++ 한다.
    // 3. zeroCnt가 k를 넘으면 왼쪽기준으로 left값을 왼쪽에서 처음 나오는 data[?] == 0 의 index로 바꾼다. --> 이걸 어떻게 알지
    // 4. 이 상태에서 right -left 값 +1 이 1111...의 길이임
    // 5. right -left 값 +1과 기존 max 값을 비교해서 right -left 값 +1이 크면 right -left 값 +1를 max로 넣는다.
    // 6. for 문을 반복해서 쭈욱 해본다.
    public int solution(int n, int k, Integer[] data) {

        int max = 0;
        int sum = 0;
        int zeroCnt = 0;
        int left = 0;
        int leftZeroIndex = 0;

        for (int right=0; right<n; right++) {
            if (data[right] == 0) {
                zeroCnt++;
            }

            if (zeroCnt > k) {
                //맨 왼쪽 값을 하나 빼주는게 아니라 0을빼야되는거아님?
                for (int j=leftZeroIndex; j<right; j++) {
                    if (data[j]==1) {
                        continue;
                    } else if (data[j]==0) {
                        left = j;
                        leftZeroIndex = j;
                        break;
                    }
                }
                zeroCnt--;
            }

            //길이
            int length = right-left;
            if (max < length) {
                max = length;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] data = new Integer[n];
        for (int i=0; i<n; i++) {
            data[i] = sc.nextInt();
        }

        Main_20 main = new Main_20();
        System.out.println(main.solution(n,k,data));
    }
}
