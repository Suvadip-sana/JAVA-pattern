
/*

 1 2 3 4 5 6 7 8 9 10
 1 2 3 4 5 6 7 8 9
 1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7
 1 2 3 4 5 6
 1 2 3 4 5
 1 2 3 4
 1 2 3 
 1 2
 1
 
 */


import java.util.Scanner;

public class a63_invertedHalfPyramid {

    public static void invertedHalfPyramidWithNumbers(int lineNum) {
        for(int i = 1; i <= lineNum; i++){
            for(int j = 1; j <= (lineNum-i)+1; j++){
                System.out.print(" " + j + " ");
            }
            
            System.out.println();
        }        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the line number: ");
        int num = sc.nextInt();

        invertedHalfPyramidWithNumbers(num);

        sc.close();;
    }    
}
