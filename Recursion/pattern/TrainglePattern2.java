package Recursion.pattern;
/*

 *
 * *
 * * *
 * * * *

 */

public class TrainglePattern2 {
    public static void main(String[] args) {
        triangle2(5,0);
    }

    public static void triangle2(int row, int col){
        //base condition
        if(row == 0){
            return;
        }
        if(col < row){
            triangle2(row, col+1);
            System.out.print("*");

        }else{
            triangle2(row-1, 0);
            System.out.println();
        }
    }
}
