package algoritmos.leetCode.twoPointers;

import java.util.Arrays;
import java.util.HashMap;

public class Problems {

    // LeetCode Problem 1
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i=0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.get(nums[i]) == null) {
                map.put(difference, i);
            } else {
                result[0] = map.get(nums[i]);
                result[1] = i;
                return result;
            }
        }
        return result;
    }

    // LeetCode Problem 3
    public int lengthOfLongestSubstring(String string) {
        // Tamanho da string
        int size = string.length();
        if (size == 0) return 0;

        // HashMap que armazena os caracteres e suas posições
        HashMap<Character, Integer> mapa = new HashMap<>();

        // Ponteiro da esquerda
        int left = 0;

        // Variável que armazena o tamanho da maior substring
        int longest = 0;

        for (int i = 0; i < size; i++) {
            // Caractere da vez a ser analisado
            char sub = string.charAt(i);

            // Se o HashMap tiver o caractere e se a posição do caractere foi maior ou igual o valor da posição do ponteiro
            if (mapa.containsKey(sub) && mapa.get(sub) >= left) {
                left = mapa.get(sub) + 1;

            } else {
                // Caso contrário só atualizada a variável 'longest' (Se o novo valor for maior que o valor atual)
                if (i - left + 1 > longest) {
                    longest = i - left + 1;
                }
            }

            // Põe o caractere no HashMap
            mapa.put(Character.valueOf(sub), i);
        }

        return longest;
    }

    // Leetcode problem 26
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    // Leetcode problem 34
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        if (nums.length == 0) {
            return result;
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

                while (firstPointer >= 0 && nums[firstPointer] == target) {
                    result[0] = firstPointer;
                    firstPointer--;
                }
                while (lastPointer < nums.length && nums[lastPointer] == target) {
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
        return result;

    }
}
