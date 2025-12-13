package Recursion.medium;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        sort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    static void sort(int[] nums, int low, int high){
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e-s)/2;
        int pivot = nums[mid];

        while(s <= e){
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }

            if(s <= e){
                //swap
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        sort(nums, low, e);
        sort(nums, s, high);
    }
}
