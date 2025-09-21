package Sorting;

public class Insertion_sort {

//    public static void insertionSort(int[] array){
//        int n  = array.length;
//
//        for(int i=1; i<n; i++){
//            int j=i;
//
//            while(j>0 && array[j] < array[j-1]){
//                int temp = array[j];
//                array[j] = array[j-1];
//                array[j-1] = temp;
//                j--;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {8,3,2,9,1};
//        insertionSort(arr);
//
//        //used to print the sorted array
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//    }

    public static void insertionSort(int[] array){
        int n = array.length;

        for(int i=1; i<n; i++){

            int j  = i;
            while(j>0 && array[j] < array[j-1]){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,6,9,40};
        insertionSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
