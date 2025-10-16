public class main {


    //find the largest number in all three (✅)
    //Area Of Circle Java Program pie*r*r (✅)
    // print number from 1 to n (✅)
    //Reverse A String In Java (✅)
    //Power In Java (✅)
    //Factorial Program In Java (✅)
    //Calculate Average Of N Numbers

    public static void main(String[] args) {
        int[] array = {1,2,3,56,78,99};
        int target = 56;
        System.out.println(search(array, target, 0, array.length-1));
    }

    //binary search using recursion
    public static int search(int[] arr, int target, int start , int end){

        if(start > end) return -1;

        int mid = start + (end-start)/2;

        if(target == arr[mid]){
            return mid;
        }
        if(target < arr[mid]){
            return search(arr, target,start, mid-1);
        }
        return search(arr, target, mid+1, end);
    }
}
