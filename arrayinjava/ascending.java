package arrayinjava;
//using sort make them to ascending order.

import java.util.Scanner;

public class ascending {
    public static void main(String[] args) {
        int a[] = new int[5];
        int temp;

        Scanner ref = new Scanner(System.in);
        System.out.println("Enter 5 array elements:");
        for(int i = 0; i < 5; i++) {
            a[i] = ref.nextInt();
        }

        // Sorting in ascending order
        for(int i = 0; i < 5; i++) {
            for(int j = i + 1; j < 5; j++) {
                if(a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Sorted ascending elements:");
        for(int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
         }

// Sorting in descending order
        for(int i = 0; i < 5; i++) {
            for(int j = i + 1; j < 5; j++) {
                if(a[i] < a[j]) {   // notice the '<' here
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Sorted descending elements:");
        for(int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
    }


    }

