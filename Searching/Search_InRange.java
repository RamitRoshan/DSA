package Searching;

public class Search_InRange {

    public static int searchInrange(int[] arr, int target, int start, int end){
        if(arr.length ==0) return -1;

        for(int i = start; i<=end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 12;  //it is at index 1

        System.out.println(searchInrange(arr, target, 2,5));
    }
}
