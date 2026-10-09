package july;

import java.util.Scanner;

public class Even_Odd1 {
    public static void main(String[] args) {

        Scanner ref = new Scanner(System.in);

        System.out.println(" Enter a number: ");
        int number = ref.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number. ");
        } else {
            System.out.println(number + " is an odd number.");
        }

    }
}
