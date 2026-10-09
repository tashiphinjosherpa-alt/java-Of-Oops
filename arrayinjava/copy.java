package arrayinjava;

import java.util.Scanner;
public class copy {
    public static void main(String[] args) {
        
        int a[]=new int[5];
        int b[]=new int[5];

        Scanner  ref= new Scanner(System.in);
        System.out.println("enter the  value in array");

        for(int i=0;i<5;i++){

            a[i]=ref.nextInt();
        }
        System.out.println("Frist array element");
        for(int i=0;i<5;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("second number element");
        for(int i=0;i<5;i++){
            b[i]=a[i];
            System.out.println(" "+b[i]);
        }

    }
}
