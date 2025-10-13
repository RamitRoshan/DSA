package Pattern;

/*
1.  *****
    *****
    *****
    *****
    *****
*/
public class ques1 {
    public static void main (String[] args){
        int n = 5;

        for (int i = 1; i <= n; i++) {      // i → rows
            for (int j = 1; j <= n; j++) {  // j → columns
                System.out.print("*");
            }
            System.out.println();           // move to next row
        }

    }
}

/*
Each i → prints one row of stars
Each j → prints one * in that row

i (row)	    j (column loop)	   Printed output so far
1           	j = 1 → *       *****
                j = 2 → *
                j = 3 → *
                j = 4 → *
                j = 5 → *

 */
