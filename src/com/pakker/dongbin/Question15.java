package com.pakker.dongbin;

public class Question15 {
    public static int factorialFor(int n) {
        int result = 1;
        for(int i =1; i<=n;i++) {
            result = result *i;
        }
        return result;
    }

    public static int factorialRecursive(int n){
        if(n <=1) {
            return 1;
        }
        return n * factorialRecursive(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorialFor(5));
        System.out.println(factorialRecursive(5));
    }
}
