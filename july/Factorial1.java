package july;

import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {
        
Scanner ref = new Scanner(System.in);


System.out.println("Enter a number to find its factorials: ");
int num= ref.nextInt();

if(num<0)
{
    System.out.println(" Factorial is not defined for negative numbers.");
}
else{
    long fact=1;

     for(int i=1; i<=num;i++){

        fact=fact*i;

     }

System.out.println("Factorial of "+num+ " is " +fact);

}
    }
}
