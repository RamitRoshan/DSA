package Recursion.medium;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {4,3,2,1};
        selection(array, array.length, 0, 0);
        System.out.println(Arrays.toString(array));
    }

    public static void selection(int[] arr, int row, int col, int max){
        //base condition
        if(row == 0){
            return;
        }
        //for current row we need to maintain max.
        if(col < row){
            //here we are taking max as a index
            if(arr[col] > arr[max]){
                selection(arr, row, col+1, col); //max = col

            }else{
                selection(arr, row, col+1, max);
            }

        }else{
            //swapp
            int temp = arr[max];
            arr[max]  = arr[row-1];
            arr[row-1] = temp;
            selection(arr, row-1, 0, 0);
        }
    }
}
