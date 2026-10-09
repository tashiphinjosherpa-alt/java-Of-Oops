package arrayinjava;
import java.util.Scanner;

public class deletre {
    public static void main(String[] args) {
        int loc, size;

        Scanner ref = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        size = ref.nextInt();

        int a[] = new int[size];

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            a[i] = ref.nextInt();
        }

        System.out.println("Enter the location to delete (0 to " + (size - 1) + "):");
        loc = ref.nextInt();

        if (loc < 0 || loc >= size) {
            System.out.println("Invalid location!");
        } else {
            // Shift elements left from loc
            for (int i = loc; i < size - 1; i++) {
                a[i] = a[i + 1];
            }
            size--; // reduce size after deletion

            System.out.println("Array after deletion:");
            for (int i = 0; i < size; i++) {
                System.out.println(a[i]);
            }
        }
    }
}
