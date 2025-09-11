package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

import BubbleSort.BubbleSort;
import NoRepetition.NoRepetition;
import SelectionSort.SelectionSort;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] A = {3, 5, 6, 8, 10, 1, 2, 7, 9, 4};
        int[] resultbs = bs.BubbleSortFunction(A);
        System.out.println("Bubble Sort Algorithm: " + Arrays.toString(resultbs));


        SelectionSort  ss = new SelectionSort();
        int[] resultss = ss.SelectionSortFunction(A);
        System.out.println("Selection Sort Algorithm: " + Arrays.toString(resultss));


        NoRepetition nr = new NoRepetition();
        int[] B = {1,1,2,3,1,2,3,4};
        int[] BClear = new int[4];
        int[] resultNR = nr.NoRepetitionFunction(B, BClear);
        System.out.println("No Repetition on array: " + Arrays.toString(resultNR));
    }
}