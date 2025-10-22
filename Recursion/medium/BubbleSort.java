package Recursion.medium;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {4,3,2,1};
        bubble(array,array.length-1, 0);
        System.out.println(Arrays.toString(array));
    }
    public static void bubble(int[] arr, int row, int col){
        //base condition
        if(row == 0){
            return;
        }

        if(col < row){
            if(arr[col] > arr[col+1]){
                //swap
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubble(arr, row, col+1);
        }else {
            bubble(arr, row-1, 0);
        }
    }
}
