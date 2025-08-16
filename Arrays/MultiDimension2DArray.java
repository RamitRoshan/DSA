package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension2DArray {
    public static void main(String[] args) {
        /*
          If we want to print an array, which something looks like matrix
          1 2 3
          4 5 6
          7 8 9
          here we have 3 rows and 3 columns
        */
        Scanner sc = new Scanner(System.in);
        //int[][] arr = new int[3][4];  //3 rows & 4 columns

//        int[][] arr1 = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };

//        int[][] arr = {
//                {1, 2, 3}, //0th index
//                {4, 5},  //1st index
//                {6,7, 8, 9} //2nd index -> arr[2] = {6,7,8,9}
//        };

        int[][] arr = new int[4][3];
        System.out.println(arr.length); //it will give length of rows(no of rows)

        //input
        for(int row=0; row<arr.length; row++){
            //for each col in every row, I want to take input.
            for(int col=0; col<arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        //output
//        for(int row=0; row<arr.length; row++){
//            //for each col in every row, I want to take input.
//            for(int col=0; col<arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        //output
//        for(int row=0; row<arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //output: using for each loop
        //why int[] a: => the datatypes of every element is integer here
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
