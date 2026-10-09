package javaaa;

public class star2 {
   public static void main(String[] args) {
       // First half: increasing triangle
       for(int i=1; i<=5; i++){
           for(int j=1; j<=i; j++){
               System.out.print("*");
           }
           System.out.println();
       }

       // Second half: decreasing triangle
       for(int i=1; i<=5; i++){
           for(int j=5; j>=i; j--){
               System.out.print("*");
           }
           System.out.println(); // <-- add newline here
       }
   } 
}
