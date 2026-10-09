import java.util.Scanner;
 public class simplecalculator {
   public static void main(String[] args) {
     int mnum, num1, num2;

     Scanner ref = new Scanner(System.in);

System.out.println("menu");
System.out.println("1. addition");
System.out.println("2. subtraction");
System.out.println("3. multiplication");
System.out.println("4. divison");
System.out.println("5. remainder");

System.out.println("Enter your choice(1-5)");
mnum=ref.nextInt();

System.out.println("enter number");
num1 = ref.nextInt();

System.out.println("enter number another");
num2=ref.nextInt();

switch(mnum){
    case 1:
        System.out.println("answer is "+(num1 + num2));
        break;


        
        
    case 2:
        System.out.println("answer is " +(num1 - num2));
        break;

    case 3:
        System.out.println("answer is " +(num1*num2)); 
        break;
        
    case 4:
     System.out.println(" answer is "+(num1/num2));    
     break;
     
     case 5: 
     System.out.println("answer is " +(num1%num2));

     default :
     System.out.println("error");
    


}

   } 
}
