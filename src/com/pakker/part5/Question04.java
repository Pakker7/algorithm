package com.pakker.part5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question04 {

    //https://www.acmicpc.net/problem/3052
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set set = new HashSet();
        for (int i = 0; i < 10; i++) {
            set.add(scanner.nextInt() % 42);
        }

        System.out.println(set.size());
    }
}
