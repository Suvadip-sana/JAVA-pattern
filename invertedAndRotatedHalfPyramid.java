


/*

                *
            *   *
        *   *   *
    *   *   *   *
*   *   *   *   *


 */




import java.util.Scanner;

public class invertedAndRotatedHalfPyramid {

    public static void inverted_and_rotated_half_pyramid(int lineNum) {

        // For track the line number(matrix's rows and columns are same) that is equal to n-1
        for(int i = 1; i <= lineNum; i++){
            // For track the spaces
            for(int j = 1; j <= lineNum-i; j++){
                System.out.print("   ");
            }

            // For track the stars that is equal to i
            for(int j = 1; j <= i; j++){
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the line number: ");
        int num = sc.nextInt();

        inverted_and_rotated_half_pyramid(num);

        sc.close();
    }
}
