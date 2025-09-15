package org.example;

import java.util.Arrays;

import binarySearch.BinarySearch;
import bubbleSort.BubbleSort;
import noRepetition.NoRepetition;
import recursividade.Recursividade;
import selectionSort.SelectionSort;

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

        BinarySearch binarySearch = new BinarySearch();
        int[] C = {1,6,10,11,12,13,14,15,16,19,19,19,20,100,125,132,400};
        int resultBinarySearch = binarySearch.BinarySeacrhFunction(C,19);
        System.out.println("Binary Search Algorithm: " + resultBinarySearch);


        Recursividade fatorial  = new Recursividade();
        double fatorialResult = fatorial.fatorial(5);
        System.out.println("Fatorial Algorithm: " + fatorialResult);

        Recursividade fibonacci =  new Recursividade();
        double fibonacciResult = fibonacci.fibonacci(7);
        System.out.println("Fibonacci Algorithm: " + fibonacciResult);
    }
}