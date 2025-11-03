package org.example;

import algoritmos.classicos.SelectionSort;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SelectionSort algoritmo = new SelectionSort();
//

        int[] unOrderedArray = {29,12,15,1,7,9,11,5,25,31};
//


        System.out.println("Selection sort: " + Arrays.toString(algoritmo.function(unOrderedArray)));
//
//
//        algoritmo.quickSort(unOrderedArray, 0, unOrderedArray.length);
//        System.out.println("Quick sort: " + Arrays.toString(unOrderedArray));
//
//        algoritmo.mergeSort(unOrderedArray);
//        System.out.println("Merge sort: " + Arrays.toString(unOrderedArray));
//        int[] nums = {3, 2, 4};
//        int target = 6;
//        System.out.println(algoritmo.twoSum(nums, target));
//        String s = "abcabcabcc";
//        HashMap<Character, Integer> map = new HashMap<>();
//        map.put(s.charAt(0),0);
//        System.out.println(map);
//        int l=0;
//        int r=0;
//        int longestSub = 1;
//        for (int i=1; i < s.length(); i++) {
//            if (map.get(s.charAt(i)) == null) {
//                map.put(s.charAt(i),i);
//                System.out.println(map);
//                r++;
//                if (r-l > longestSub) {
//                    longestSub += r-l;
//                }
//            } else {
//                r++;
//                l = r;
//            }
//        }
    }
}
