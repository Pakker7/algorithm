package com.pakker.part5;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Question01 {

    //https://www.acmicpc.net/problem/10818
    public static void main(String[] args) {
        // good
        Scanner scanner = new Scanner(System.in);
        int nCnt = scanner.nextInt();
        int[] nArray = new int[nCnt];
        int i = 0;

        while (i < nCnt) {
            nArray[i++] = scanner.nextInt();
        }

        Arrays.sort(nArray);

        System.out.println(nArray[0] + " " + nArray[nCnt - 1]);

        // 1차
//        Scanner scanner = new Scanner(System.in);
//        int nCnt = Integer.parseInt(scanner.nextLine());
//        int[] nArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        System.out.print(Arrays.stream(nArray).min().getAsInt() + " " + Arrays.stream(nArray).max().getAsInt());

    }
}
