package com.pakker.inflearn;

// 0 1 2 3 4 5 6 7 8 9 10111213
// 1 1 0 0 1 1 0 1 1 0 1 1 0 1

// 1. right 값을 하나씩 늘려가며 1의 갯수를 센다.
// 2. zeroCnt > k 이면 left++ 한다. --> 이게 먼저 나와야 됨
// left++ 했는데, data[left]==0 이면 zeroCnt 그대로, data[left]==1 이면 zeroCnt --한다.
// 3. right 했는데 data[right]==0이면, zeroCnt++한다.
// 4. right-left 랑 maxLength 랑 비교해서 큰 값을 maxLength에 넣는다.
// 5. 끝까지 다 돌면 끝

import java.util.*;

public class Main_20 {


    public int solution(int n, int k, Integer[] data) {
        int left = 0;
        int zeroCnt = 0;
        int maxLength = 0;

        for (int right = 0; right < n; right++) {
            // 오른쪽 포인터 이동 중 0을 만나면 zeroCnt 증가
            if (data[right] == 0) {
                zeroCnt++;
            }

            while (zeroCnt > k) { // while로 계속 반복하기....
                if (data[left] == 0) {
                    zeroCnt--;
                }
                left++;
            }

            // 최대 길이 갱신
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] data = new Integer[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        Main_20 main = new Main_20();
        System.out.println(main.solution(n, k, data));
    }
}
