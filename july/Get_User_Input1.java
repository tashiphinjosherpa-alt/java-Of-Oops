package july;

import java.util.Scanner;

public class Get_User_Input1 {
    public static void main(String[] args) {

        // banking application

        Scanner ref = new Scanner(System.in);
        double balance = 0;
        int choice;

        while (true) {
            System.out.println("Select one option From Below Bank App: ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.println("Enter Your Choice: ");
            choice = ref.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: " + balance + "Rs.");
                    break;

                case 2:
                    System.out.println("Enter amount to deposit: ");
                    double deposit = ref.nextDouble();
                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Amount Deposit Successfully.");
                    } else {
                        System.out.println("Invalid amount! Please enter a positive value.");

                    }
                    break;
                case 3:
                    System.out.println("Enter Amount To be Withdraw");
                    double withdraw = ref.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Amount withdraw Successfully");
                    } else if (withdraw <= 0) {
                        System.out.println("Invalid amount! PLease enter a positive value.");

                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using our banking service.");
                    return;

                default:
                    System.out.println("Invalid choice! Please Enter a number between 1 and 4.");
            }
            System.out.println("----------------------------------------------------------");
        }

    }

}
