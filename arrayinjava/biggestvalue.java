package arrayinjava;

import java.util.Scanner;

public class biggestvalue {
    public static void main(String[] args) {
        int a[] = new int[5];
        int max,min;

        Scanner ref = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");

        // Store input into the array
        for (int i = 0; i < 5; i++) {
            a[i] = ref.nextInt();
        }

        // Initialize max with the first element
        max = a[0];

        // Compare each element
        for (int i = 1; i < 5; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }

        System.out.println("The biggest number is " + max);


        min=a[0];
        for (int i = 1; i < 5; i++) {
            if (a[i] <  min) {
                min = a[i];
            }
            
        }
        System.out.println(" the smallest value us " + min);
    }
}
