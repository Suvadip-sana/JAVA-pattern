

/*

 * * * * * * * * * * * *
 *                     *
 *                     *
 *                     *
 *                     *
 * * * * * * * * * * * *
 
 */

import java.util.Scanner;

public class hollowRectanglePattern {

    public static void hollow_rectangle(int rows, int columns) {
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= columns; j++){
                if(i == 1 || i == rows || j == 1 || j == columns){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        hollow_rectangle(r, c);

        sc.close();
    }
}
