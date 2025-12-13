package Recursion.medium;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        array = mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] mergeSort(int[] arr){
        //base cond(when only 1 element left)
        if(arr.length == 1){
            return arr;
        }
        //taking middle element and split it into two
        int mid = arr.length/2;

        //here we will pass copy of array(getting answer of an array)
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        //now we have left and right sorted, after that we will merge these 2 array and return it
        return merge(left, right);
    }
    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j< second.length){
            if(first[i] < second[i]){
                mix[k] = first[i];
                i++;
            } else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
