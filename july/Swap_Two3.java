package july;

import java.util.Scanner;

public class Swap_Two3 {
    public static void main(String[] args) {
        
Scanner ref= new Scanner(System.in);

System.out.println("Enter first value: ");
int  num1= ref.nextInt();

System.out.println("Enter second value: ");
int num2 = ref.nextInt();

System.out.println("before swapping: num1 = "+num1+ ", num2 = "+num2);

num1= num1+num2;
num2= num1-num2;
num1=num1-num2;

System.out.println("After swapping: "+num1+ " and "+num2);


    }
}
