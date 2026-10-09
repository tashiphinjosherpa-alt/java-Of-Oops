package javaaa;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        String nak;

        do {
            int result;

            System.out.println("Enter first number: ");
            int n1 = ref.nextInt();

            System.out.println("Enter second number: ");
            int n2 = ref.nextInt();

            System.out.println("Select symbol (+, -, *, /, %): ");
            String sym = ref.next();

            switch (sym) {
                case "+":
                    result = n1 + n2;
                    System.out.println("Addition result: " + result);
                    break;

                case "-":
                    result = n1 - n2;
                    System.out.println("Subtraction result: " + result);
                    break;

                case "*":
                    result = n1 * n2;
                    System.out.println("Multiplication result: " + result);
                    break;

                case "/":
                    if (n2 != 0) {
                        result = n1 / n2;
                        System.out.println("Division result: " + result);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;

                case "%":
                    if (n2 != 0) {
                        result = n1 % n2;
                        System.out.println("Remainder result: " + result);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;

                default:
                    System.out.println("Invalid symbol!");
                    break;
            }

            System.out.println("Do you want to continue? (y for yes, n for no)");
            nak = ref.next();
        } while (nak.equalsIgnoreCase("y"));

        
    }
}
