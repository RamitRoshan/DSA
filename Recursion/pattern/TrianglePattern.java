package Recursion.pattern;

/*

* * * *
* * *
* *
*

*/
public class TrianglePattern {
    public static void main(String[] args) {
        triangle(4, 0);
    }

    public static void triangle(int row, int col){
        //base condition
        if(row == 0){
            return;
        }

        if(col < row){
            System.out.print("*" + " ");
            //increase col by 1, row will be same and print *
            triangle(row, col+1);

        }
        //entire line is finished and here no. of row = no. of col
        //now we need a new line i.e reduce the row and reset the colm with 0.
        // row 3 (before it was row 4)
        else{

            //adding new lines
            System.out.println();
            triangle(row-1, 0);
        }
    }
}
