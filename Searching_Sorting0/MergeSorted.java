package Searching_Sorting0;

import java.util.Arrays;

public class MergeSorted {
    public static void main(String[] args){
        
    int[] nums = {5, 2, 9, 1, 6, 3};
        
    Solution3 sorter = new Solution3(); 
    int[] sorted = sorter.mergeSort(nums);

    System.out.println("Sorted array: " + Arrays.toString(sorted));
    }
}

class Solution3{

    public int[] mergeSort(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        int mid = nums.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);
    }
    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}