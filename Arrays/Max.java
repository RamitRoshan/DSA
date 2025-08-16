package Arrays;

public class Max {
    //find the maximum value
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 23, 9, 18};
        System.out.println("Maximum value in the given array is: " + max(arr));
        System.out.println("Maximum value in the given range is: " + maxRange(arr,0, 2 ));
    }
    //imagine that array is not empty (that why we write int max = arr[0]
    //if it will be empty then int max = INTEGER.MIN_VALUE;
    public static int max(int[] arr){

        //edge cases for understanding (not required as always)
        if(arr.length == 0) return -1;

        int maxVal  = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }


    //finding maximum value in the range
    public static int maxRange(int[] arr, int start, int end){

        //work on edge cases here like array being null
        if(end>start){
            return -1;
        }
        if(arr == null){
            return -1;
        }

        int maxVal  = arr[start];
        for(int i=start; i<=end; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}
