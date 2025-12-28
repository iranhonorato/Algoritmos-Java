package org.example;


import algoritmos.montanhaFrodo.Posicao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        int[] result = {-1,-1};
        if (nums.length == 0) {
            System.out.println("Nenhum numero encontrado");
        }
        int firstPointer;
        int lastPointer;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (right + left)/2;
            if (nums[mid] == target) {
                firstPointer = mid;
                lastPointer = mid;

                result[0] = firstPointer;
                result[1] = lastPointer;

                while (nums[firstPointer] == target && firstPointer > 0) {
                    result[0] = firstPointer;
                    firstPointer--;
                }
                while (nums[lastPointer] == target && lastPointer < nums.length) {
                    result[1] = lastPointer;
                    lastPointer++;
                }

                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(result);

    }
}
