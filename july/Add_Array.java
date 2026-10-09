package july;

import java.util.Scanner;

public class Add_Array {
    public static void main(String[] args) {
        
int a[]= new int[5]; int sum=0;
Scanner r= new Scanner(System.in);
System.out.println("Enter element in Array");

for(int i=0;i<a.length;i++){

  a[i]=  r.nextInt();
}
System.out.println("Array Element ");
for(int i=0;i<a.length;i++){

    System.out.println(a[i]+" ");
     sum = a[i]+ sum;
}
System.out.println(" Addition of Array is "+sum);

    }
}
