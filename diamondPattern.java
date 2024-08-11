



/*




       *  *  *  *  * 
    *  *  *  *  *  *  * 
 *  *  *  *  *  *  *  *  * 
 *  *  *  *  *  *  *  *  * 
    *  *  *  *  *  *  * 
       *  *  *  *  * 
          *  *  *
             *


 */




 import java.util.Scanner;

 public class diamondPattern {
     public static void diamond(int n) {
 
         // for first half
         for(int i = 1; i <= n; i++){
             // For spaces - (n-i)
             for(int j = 1; j <= (n-i); j++){
                 System.out.print("   ");
             }
             
             // For stars -> Every odd number = 1, 3, 5, 7,....
             for(int j = 1; j <= (2*i)-1; j++){
                 System.out.print(" * ");
             }
 
             System.out.println();
         }
         
         
         // for second half
         for(int i = n; i >= 1; i--){
             // For spaces - (n-i)
             for(int j = 1; j <= (n-i); j++){
                 System.out.print("   ");
             }
             
             // For stars
             for(int j = 1; j <= (2*i)-1; j++){
                 System.out.print(" * ");
             }
 
             System.out.println();
         }
     }
     
     
     
     public static void realDiamond(int n) {
 
         // for first half
         for(int i = 1; i <= n; i++){
             // For spaces - (n-i)
             for(int j = 1; j <= (n-i); j++){
                 System.out.print("   ");
             }
             
             // For stars
             for(int j = 1; j <= (2*i)-1; j++){
                 if(i != 1 && i != 2){
                     System.out.print(" * ");
                 }
                 else{
                     System.out.print("   ");
                 }
             }
 
             System.out.println();
         }
         
         
         // for second half
         for(int i = n; i >= 1; i--){
             // For spaces - (n-i)
             for(int j = 1; j <= (n-i); j++){
                 System.out.print("   ");
             }
             
             // For stars
             for(int j = 1; j <= (2*i)-1; j++){
                 System.out.print(" * ");
             }
 
             System.out.println();
         }
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int num = sc.nextInt();
 
         // diamond(num);
         realDiamond(num);
 
         sc.close();
     }
     
 }
 