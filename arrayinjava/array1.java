package arrayinjava;

import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        int size,i;
        Scanner ref=new Scanner(System.in);
        System.out.println("enter any element : ");
        size=ref.nextInt();

        System.out.println();
        
        int a[]= new int[size];

        for(i=0;i<size;i++){
            a[i]=ref.nextInt();
        }

        System.out.println("print the number in display ");

        for(i=0;i<size;i++){
     System.out.println(a[i]+ " ");

        }

    }
    
}
