package org.example;

import algoritmos.Algoritmos;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Algoritmos algoritmo = new Algoritmos();

        int[] orderedArray = {1,2,3,4,5,6,7,8,9,10,11,11,11,11,11,11,12};
        int[] unOrderedArray = {29,12,15,1,7,9,11,5,25,31};

        System.out.println("Busca binária: " + algoritmo.binarySearch(orderedArray,11));
        System.out.println("Bubble sort: " + Arrays.toString(algoritmo.bubbleSort(unOrderedArray)));
        System.out.println("Selection sort: " + Arrays.toString(algoritmo.selectionSort(unOrderedArray)));
        }
    }
