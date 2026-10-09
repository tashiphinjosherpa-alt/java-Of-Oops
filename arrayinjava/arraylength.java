package arrayinjava;

import java.util.Scanner;
public class arraylength {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner ref=new Scanner(System.in);
        System.out.println("enter an element ");
        for(int i=1;i<=a.length;i++){
            a[i]=ref.nextInt();

        }
        System.out.println(" array element ");

        for(int i=1;i<=a.length;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("arrayb ;ength "+a.length);
    }
    
}
