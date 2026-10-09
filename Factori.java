import java.util.Scanner;

public class Factori {
    public static void main(String[] args) {
        int num, fact = 1;
        Scanner ref = new Scanner(System.in);

        System.out.println("Enter any number:");
        num = ref.nextInt();

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
