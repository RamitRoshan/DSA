package Recursion.medium;

import java.util.Arrays;

/* here, we don't need to create a new copy of an array or objects, use the original array
and modify that only.  */
public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        mergeSortInPlace(array, 0, array.length);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSortInPlace(int[] arr, int start, int end){

        //base condition
        if(end - start == 1){
            return;
        }
        int mid = (start + end)/2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);
        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end){
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;
        while (i< mid && j<end){
            if(arr[i]< arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < end){
            mix[k] = arr[j];
            j++;
            k++;
        }

        //modifying the original array
        for(int l=0; l<mix.length; l++){
            arr[start + l] = mix[l];
        }
    }
}
