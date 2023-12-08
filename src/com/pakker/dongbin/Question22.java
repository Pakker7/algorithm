package com.pakker.dongbin;

//https://www.youtube.com/watch?v=KGyK-pNvWos&list=PLRx0vPvlEmdAghTr5mXQxGpHjWqSz0dgC&index=4
// 선택 정렬
public class Question22 {

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j< array.length; j++) {
                if (array[i] < array[j]) {
                    minIndex = j;
                }
            }
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }

        return array;
    }

    public static void main(String[] args) {

        int[] array = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        array = sort(array);
        System.out.println(array);
    }

}

