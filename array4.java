 
 import java.util.Scanner;
 public class array4 {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
         

         int arr[][] =  int[2][3];

         for(int i=0;i<arr.length;i++) {
            for(int j=0;arr[i].length;j++){
                System.out.println("enter the value for [" + i +","+j +"]:");
                arr[i][j]=ref.nextInt();
            }
         }
         for(int i=0;i<arr.length;i++) {
            for(int j=0;arr[i].length;j++){
                System.out.println("["+i+":"j"] " +arr[i ][j]);
            }
        
        System.out.println();
         }
    }
    
}
