/*


 *                          * 
 *  *                    *  * 
 *  *  *              *  *  * 
 *  *  *  *        *  *  *  * 
 *  *  *  *  *  *  *  *  *  * 
 *  *  *  *  *  *  *  *  *  * 
 *  *  *  *        *  *  *  * 
 *  *  *              *  *  * 
 *  *                    *  * 
 *                          *
  
 
 */




import java.util.Scanner;

public class butterflyPattern {

    public static void butterfly(int n) {
        // 1st half
        for(int i = 1; i <= n; i++){
            // Stars - i
            for(int j = 1; j <= i; j++){
                System.out.print(" * ");
            }

            // Spaces - 2*(n-i) 
            for(int j = 1; j <= 2*(n - i); j++){
                System.out.print("   ");
            }

            // Stars - i
            for(int j = 1; j <= i; j++){
                System.out.print(" * ");
            }

            System.out.println();
        }

        

        // 2nd half
        for(int i = n; i >= 1; i--){
            // Stars - i
            for(int j = 1; j <= i; j++){
                System.out.print(" * ");
            }

            // Spaces - 2*(n-i) 
            for(int j = 1; j <= 2*(n - i); j++){
                System.out.print("   ");
            }

            // Stars - i
            for(int j = 1; j <= i; j++){
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ener a number: ");
        int num = sc.nextInt();

        butterfly(num);

        sc.close();
    }
    
}
