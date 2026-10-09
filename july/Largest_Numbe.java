package july;

import java.util.Scanner;

public class Largest_Numbe {
    public static void main(String[] args) {

        Scanner ref = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = ref.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = ref.nextInt();

        System.out.println("Enter number 3: ");
        int num3 = ref.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("\n The largest number is : " + num1);
        } else if (num2 > num1 && num2 > num3) {

            System.out.println("\n The largest number is : " + num2);

        } else {
            System.out.println("\n The largest number is : " + num3);
        }

    }
}
