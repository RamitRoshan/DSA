package Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        //swap the elements of an array
        int[] arr = {1,3,23,9,18};
        swap(arr, 1, 2);

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
