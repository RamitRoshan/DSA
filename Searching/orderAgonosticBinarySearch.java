package Searching;

public class orderAgonosticBinarySearch {

    public static int orderAgnostic(int[] array, int target){

        int start = 0;
        int end = array.length-1;

        // check if array is sorted ascending or descending
        boolean isAsc = array[start] < array[end];

        while (start <= end){

            int mid = start + (end-start)/2;

            if(array[mid] == target){
                return mid;
            }

            if(isAsc){

                // for ascending
                if(target < array[mid]){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }

            }else {
                //for descending
                if(target > array[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {

        // ascending sorted array
        int[] arrAsc = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target1 = 22;
        System.out.println("Found at index (ascending): " + orderAgnostic(arrAsc, target1));

        // descending sorted array
        int[] arrDesc = {99, 80, 75, 60, 50, 30, 10, 0, -5, -20};
        int target2 = 50;
        System.out.println("Found at index (descending): " + orderAgnostic(arrDesc, target2));
    }
}
