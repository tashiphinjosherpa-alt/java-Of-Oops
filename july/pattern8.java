package july;



public class pattern8 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            // Print leading spaces
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }

            // Print stars and spaces for hollow effect
            for (int k = 1; k <= (i * 2)-1; k++) {
                if (k > 1 && k < (i * 2 - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

      
        for (int i = 1; i <= 5; i++) {
            // Print leading spaces
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            // Print stars and spaces for hollow effect
            for (int k = 1; k <= (i * 2 - 1); k++) {
                if (k > 1 && k < (i * 2 - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }


    }

