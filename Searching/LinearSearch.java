package Searching;

public class LinearSearch {

    public static int linearSearch(int[] arr, int target){

        //edge cases
        if(arr.length == 0) return -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;  //return index
            }
        }
        return -1; //not found
    }
    public static void main(String[] args) {
        int[] nums = {20,70,40,60};
        int target = 400;

        int result = linearSearch(nums, target);
        System.out.print(result);
    }
}
