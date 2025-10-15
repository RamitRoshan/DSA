package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 55, 66, 78};
        int target = 4;
        System.out.println(search(array, target, 0, array.length-1));
    }

    public static int search(int[] arr, int target, int start, int end){
        if(start > end) return -1;

        int mid = start + (end-start)/2;

        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
            //calling a recursion call and return type is given so we will use return
            //all will be same, as target<mid then end will change
            return search(arr, target,start, mid-1);
        }
        //here, start is going to change and end will be the sane
        return  search(arr, target, mid+1, end);
    }
}

