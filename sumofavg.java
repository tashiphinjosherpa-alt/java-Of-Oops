import java.util.Scanner;
public class sumofavg {
   public static void main(String[] args) {
    int a[] =  new int[5]; int sum=0; double avg;

    Scanner ref = new Scanner(System.in);
    System.out.println("enter the array");
    for( int i=0;i<5;i++){

    a[i] = ref.nextInt();


    }
    System.out.println("array elemet");
    for( int i=0;i<5;i++){
        System.out.println(a[i]+" ");
    }

    for (int i=0;i<5;i++){
        sum = sum+a[i];
    }
    avg = sum/5;

    System.out.println("sum is " + sum + " and  average is" +avg );
   } 
}
