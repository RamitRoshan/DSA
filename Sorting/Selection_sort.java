package Sorting;

public class Selection_sort {

    public static void selectionSort(int[] array){
        int n = array.length;

        for(int i=0; i<n-1; i++){
            int min_index = i;

            for(int j= i+1; j<n; j++){
                if(array[j] < array[min_index]){
                    min_index = j;
                }
            }
            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,0,-1,45,67,8};
        selectionSort(arr);

        //print the sorted array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
