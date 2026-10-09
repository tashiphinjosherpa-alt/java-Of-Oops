public class final_variable {
   public static void main(String[] args) {
    
final int num=23; 
// num= num+34;
//the compiler stops you because this is an attempt to reassign a new value to num. That breaks the promise of final.
System.out.println(" thier ages are : "+(num+1));



   } 
}

