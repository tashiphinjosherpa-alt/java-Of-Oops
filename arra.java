 
 import java.util.Scanner;

public class arra {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);

        
        int arr[][] = new int[2][];

        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the size of column for row " + i + ": ");
            int col = ref.nextInt();

            arr[i] = new int[col]; 

            
            for (int j = 0; j < col; j++) {
                System.out.print("Enter value for [" + i + ":" + j + "]: ");
                arr[i][j] = ref.nextInt();
            }
        }

        
        System.out.println("\nJagged Array Elements");
    }
}