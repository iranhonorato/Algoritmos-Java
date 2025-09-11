package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

import BubbleSort.BubbleSort;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] A = {3, 5, 6, 8, 10, 1, 2, 7, 9, 4};
        int[] sortedA = bs.BubbleSortFunction(A);
        System.out.println(Arrays.toString(sortedA));
    }
}