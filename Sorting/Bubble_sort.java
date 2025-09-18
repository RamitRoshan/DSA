package Sorting;

public class Bubble_sort {
    public static void bubbleSort(int[] array){
        int n  = array.length;
        //outer loop
        for(int i=0; i< n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 6, 1, 4, 3};
        bubbleSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
