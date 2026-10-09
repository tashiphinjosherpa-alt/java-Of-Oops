package arrayinjava;

/**
 * copy1
 */
import java.util.Scanner;
public class copy1 {

    public static void main(String[] args) {
        int a[]= new int[5];
        int b[]=new int[5];
        int c[]= new int[5];

        Scanner ref= new Scanner(System.in);


        System.out.println("enter  any number");
        for(int i=0;i<5;i++){
            a[i]=ref.nextInt();
            
        }

        System.out.println("enter first number element");
        for(int i=0;i<5;i++){
            System.out.println(a[i]+" ");
        
        }
        System.out.println("enter second number");
        for(int i=0;i<5;i++){
            c[i]=b[i]=a[i];
            System.out.println(b[i]+" ");
        }
         System.out.println("enter third number");
         for(int i=0;i<5;i++){
            System.out.println(c[i]+" ");
         }

    }
}
