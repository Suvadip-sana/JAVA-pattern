/*


             *  *  *  *  * 
          *  *  *  *  * 
       *  *  *  *  * 
    *  *  *  *  * 
 *  *  *  *  * 



 */



 import java.util.Scanner;

 public class solidRhombus {
 
     public static void solidRhombuss(int n) {
         for(int i = 1; i <= n; i++){
 
             // For spaces
             for(int j = 1; j <= (n-i); j++){
                 System.out.print("   ");
             }
 
             // For stars
             for(int j = 1; j <= n; j++){
                 System.out.print(" * ");
             }
 
             System.out.println();
         }
         
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         System.out.print("Enter a number: ");
         int n = sc.nextInt();
         solidRhombuss(n);
 
         sc.close();
     }
     
 }
 