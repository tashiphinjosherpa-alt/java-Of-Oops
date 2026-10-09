package july;

import java.util.Scanner;

public class Swap_Two1 {
    public static void main(String[] args) {
        
Scanner ref = new Scanner(System.in);

System.out.println("Enter the first number (num1):");
int num1= ref.nextInt();

System.out.println("Enter the second number (num2):");
int num2= ref.nextInt();

System.out.println("Before swapping : num1 = "+num1+ ", num2 = "+num2);

int temp = num1;
num1= num2;
num2=temp;

System.out.println(" After swapping: num1 = "+num1+ ", num2 = "+num2);

    }
}
