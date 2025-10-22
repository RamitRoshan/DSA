package Recursion.medium;

import java.util.ArrayList;

/*
arr = [1, 2, 3, 4, 4, 8]  , target = 4
ans: [3,4]
*/
public class FIndTargetUsingArrayList {
    public static void main(String[] args) {
        int[] array = {2,3,1,4,4,5};
        System.out.println(findAllIndex(array, 4, 0, new ArrayList<>()));
    }

    public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }
}
