package Recursion.medium;
//Check if array is sorted or not

public class Sorted {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(sorted(array, 0));
    }

    public static boolean sorted(int[] arr, int index){
        //base condition -> if we are at last index
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr, index+1);
    }
}
