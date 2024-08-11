


/*

              *  *  *  *  * 
          *           *
       *           *
    *           *
 *  *  *  *  *
 
 */




 import java.util.Scanner;

 public class hollowRhombus {
     public static void hollowRhombuss(int n) {
 
         // For lines
         for(int i = 1; i <= n; i++){
 
             // For in each line print spaces at start
             for(int j = 1; j <= (n-i); j++){
                 System.out.print("   ");
             }
 
             // for printing a hollow rectangle after which show as tilted(rhombus) for spaceses at start of each line
             for(int j = 1; j <= n; j++){
                 if(i == 1 || i == n || j == 1 || j == n){
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
         System.out.print("Enter a number: ");
         int n = sc.nextInt();
         hollowRhombuss(n);
 
         sc.close();
     }
     
 }
 