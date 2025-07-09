package com.pakker.grok;

public class Main_2 {
    public int[] Solution(int[] nums) {
// 1. 짝수의 개수를 센다
        int evenCount = 0;
        for (int num : nums) {
            if (num % 2 == 0) { // 짝수인지 확인
                evenCount++;
            }
        }

        // 2. 짝수 개수만큼 새로운 배열 생성
        int[] result = new int[evenCount];

        // 3. 짝수를 새로운 배열에 채운다
        int index = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[index] = num;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main_2 main = new Main_2();
        String s = "banana";
        char ch = 'a';
    }
}