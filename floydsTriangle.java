


/*

 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 
 15 16 17 18 19
 
 */



import java.util.Scanner;

public class floydsTriangle {

    public static void floyds_trianglee(int line) {
        int count = 1;
        for(int i = 1; i <= line; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" " + count + " ");
                count++;
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter line number: ");
        int n = sc.nextInt();
        floyds_trianglee(n);

        sc.close();
    }
}
