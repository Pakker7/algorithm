package com.pakker.grok;

import java.util.LinkedHashMap;
//정수 배열 nums와 목표값 target이 주어졌을 때, 배열에서 두 수를 골라 그 합이 target이 되는 쌍의 인덱스를 반환하세요. 단, 각 숫자는 한 번만 사용할 수 있습니다.
//
//        입력: 정수 배열 nums, 목표값 target
//        출력: 두 수의 인덱스 배열 [i, j] (i ≠ j)
//        예시:
//        입력: nums = [2, 7, 11, 15], target = 9 → 출력: [0, 1]
//        입력: nums = [3, 2, 4], target = 6 → 출력: [1, 2]
//        입력: nums = [3, 3], target = 6 → 출력: [0, 1]
//        제한사항
//
//        배열 nums의 길이는 2 이상 100 이하입니다.
//        각 원소는 -100 이상 100 이하의 정수입니다.
//        답은 정확히 하나만 존재한다고 가정합니다.
public class Main_4 {
    public int[] Solution(int[] nums, int target) {
        int[] answer = new int[]{};
        for(int i=0; i<nums.length; i++) {
            int result = target - nums[i];

        }
        return answer;
    }
    public static void main(String[] args) {
        Main_4  main = new Main_4 ();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(main.Solution(nums, target));
    }
}