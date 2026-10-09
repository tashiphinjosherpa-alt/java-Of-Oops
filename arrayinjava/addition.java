package arrayinjava;
import java.util.Scanner;
public class addition {
    public static void main(String[] args) {
        

        int a[]=new int[5]; int sum=0;
        Scanner ref = new Scanner(System.in);
        System.out.println(" enter the element");

        for(int i=0;i<5;i++){

            a[i]=ref.nextInt();
        }
        System.out.println(" element are :");
        for(int i=0;i<5;i++){
         
            
            System.out.println(a[i]+"");
            sum = a[i]+sum;
        }
        System.out.println("Sum of the number is "+sum);



    }
    
}
