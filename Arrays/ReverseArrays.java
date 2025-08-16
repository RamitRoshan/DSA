package Arrays;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        //swap the elements of an array
        int[] arr = {1,3,23,9,18};

//        swap(arr, 1, 2);
//        System.out.println(Arrays.toString(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    //reverse an array
    public static void reverse(int[] arr){
        int start = 0;
        //end index in array is (n-1)
        int end = arr.length-1;

        while (start< end){
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
