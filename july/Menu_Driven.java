package july;

import java.util.Scanner;

public class Menu_Driven {
    public static void main(String[] args) {

        Scanner ref = new Scanner(System.in);
        int choice;

        do {

            System.out.println("====================Menu=======================");
            System.out.println("1. Add two number");
            System.out.println("2. Subtract two number");
            System.out.println("3. Multiply two number");
            System.out.println("4. Divide two number");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            choice = ref.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter First number: ");
                    int a1 = ref.nextInt();

                    System.out.println("Enter another number: ");
                    int a2 = ref.nextInt();
                    System.out.println();

                    System.out.println("Result = " + (a1 + a2));
                    break;
                case 2:
                    System.out.println("Enter FIrst number: ");
                    int b1 = ref.nextInt();

                    System.out.println("Enter Anoter number: ");
                    int b2 = ref.nextInt();
                    System.out.println();

                    System.out.println("Result = " + (b1 - b2));
                    break;

                case 3:
                    System.out.println("Enter first number: ");
                    int c1 = ref.nextInt();

                    System.out.println("Enter another mumber: ");
                    int c2 = ref.nextInt();
                    System.out.println("Result: " + (c1 * c2));
                    break;

                case 4:
                    System.out.println("Enter First number: ");
                    int d1 = ref.nextInt();

                    System.out.println(" Enter another number: ");
                    int d2 = ref.nextInt();

                    if (d2 != 0) {
                        System.out.println("Result = " + (d1 / d2));
                    } else {
                        System.out.println("Erroe. Division by zero");
                    }
                    break;

                case 5:
                    System.out.println("Existing program........GoodbYe!");
                    break;

                default:
                    System.out.println("INvalid choice! Please try Again.");

            }

        } while (choice != 5);

    }
}
