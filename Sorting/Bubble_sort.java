package Sorting;

public class Bubble_sort {

//    public static void bubbleSort(int[] array){
//        int n=array.length;
//
//        for (int i=0; i<n-1; i++){
//            for(int j=0; j<n-i-1; j++){
//
//                if(array[j] > array[j+1]){
//                    int temp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = temp;
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {2,0,4,7,1};
//        bubbleSort(arr);
//
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//    }

    public static void bubbleSort(int[] array){
        int n = array.length;

        for(int i=0; i<n-1; i++){
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
        int[] arr = {34,1,8,3,0};
        bubbleSort(arr);

        //printing the sorted array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}


