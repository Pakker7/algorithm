package com.pakker.part5;

import java.util.Arrays;
import java.util.Scanner;

public class Question03 {

    //https://www.acmicpc.net/problem/2577

    //다른 사람이 한 숏코딩
    // 나는 숫자를 앞에서 부터 잘랐고 재귀함수를 사용했지만 이사람은 뒤에서부터 잘라서 재귀함수도 안씀......내가 너무 비효율적으로 짠듯..
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int A[] = new int[10];
        int a = S.nextInt() * S.nextInt() * S.nextInt();
        for (; a > 0; a /= 10){
            A[a % 10]++;
        }
        for (int i : A) {
            System.out.println(i);
        }
    }
//    1차
//    static int[] result = new int[10];
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int number = 1;
//        for (int i = 0; i < 3; i++) {
//            number *= scanner.nextInt();
//        }
//
//        int numberLength = (int) (Math.log10(number) + 1);
//        getRemainder(number, numberLength);
//
//        Arrays.stream(result).forEach(System.out::println);
//    }
//
//    public static int getRemainder(int number, int length) {
//        int quotient = (int) (number / Math.pow(10, length - 1));
//        int remainder = (int) (number % Math.pow(10, length - 1));
//
//        result[quotient] += 1;
//
//        if (length == 1) {
//            return 1;
//        }
//        return getRemainder(remainder, --length);
//    }
}
