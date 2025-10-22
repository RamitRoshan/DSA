package Recursion.medium;

public class FindElementUsingLinearSearch {
    public static void main(String[] args) {
        int[] array = {2,3,1,4,4,5};
        System.out.println(find(array, 4, 0));
        System.out.println(findIndex(array, 4, 0));

        //searching targets in array from last index
        System.out.println(findIndexLast(array, 4, array.length-1));
    }

    public static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }

    public static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return findIndex(arr, target, index+1);
        }
    }


    //If we want to find index from last then
    public static int findIndexLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }else{
            return findIndexLast(arr, target, index-1);
        }
    }
}
