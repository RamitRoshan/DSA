package Sorting;

public class Insertion_sort {

    public static void insertionSort(int[] array){
        int n = array.length;

        for(int i=1; i<n; i++){
            int j=i;

            while(j>0 && array[j] < array[j-1]){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,9,1,4,67,8};
        insertionSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
