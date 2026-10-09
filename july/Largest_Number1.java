package july;

import java.util.Scanner;

public class Largest_Number1 {
    public static void main(String[] args) {

        Scanner fref = new Scanner(System.in);

        System.out.println("Enter a number 1: ");
        int num1 = fref.nextInt();

        System.out.println("Enter a number 2: ");
        int num2 = fref.nextInt();

        if (num1 > num2) {
            System.out.println("\n The largest number is : " + num1);

        } else if (num2 > num1) {
            System.out.println("\n The largest number is : " + num2);
        } else {
            System.out.println("\n Both numbers are equal.");
        }

    }
}
