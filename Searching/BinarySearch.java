package Searching;

public class BinarySearch {

    public static int binarySearch(int[] array, int target){

        int start = 0;
        int end = array.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target < array[mid]){
                end = mid -1;

            } else if (target > array[mid]) {
                start = mid +1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //array should be in sorted order(whether it's in ascending or descending order)
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 2;

        int result = binarySearch(arr, target);
        System.out.print(result);
    }
}
