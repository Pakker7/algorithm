package com.pakker.dongbin;

import java.util.Scanner;

//https://www.youtube.com/watch?v=94RC-DsGMLo&list=PLRx0vPvlEmdAghTr5mXQxGpHjWqSz0dgC&index=5
// 16:30 떡볶이 떡 만들기

/*
4 6
19 15 10 17
* */

// 이진 탐색 소스코드 구현
public class Question25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 떡의 개수(n)와 요청한 떡의 길이(m)을 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 각 떡의 개별 높이 정보
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // 이진 탐색을 위한 시작점과 끝점 설정
        int start = 0;
        int end = (int) 1e9; //10억
        // 이진 탐색 수행 (반복적)
        int result = 0;
        while (start <= end) {
            long total = 0;
            int mid = (start+end) / 2;

            for (int i=0; i<n; i++) {
                //잘랐을 때의 떡의 양 계산
                if (arr[i] > mid ) {
                    total += arr[i] - mid;
                }
            }

            if (total < m) { //떡의 양이 부족한 경우 더 많이 자르기(왼쪽 부분 탐색)
                end = mid -1;
            } else { // 떡의 양이 부족한 경우 덜 자르기(오른쪽 부분 탐색)
                result = mid; // 최대한 덜 잘랐을 때가 정답이므로, 여기에서 result에 기록
                start = mid+1;
            }
        }

        System.out.println(result);
    }
}
