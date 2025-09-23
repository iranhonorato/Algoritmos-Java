package org.example;

import algoritmos.Algoritmos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Algoritmos algoritmo = new Algoritmos();

        int[] orderedArray = {1,2,3,4,5,6,7,8,9,10,11,11,11,11,11,11,12};
        System.out.println(algoritmo.binarySearch(orderedArray,11));
        }
    }
