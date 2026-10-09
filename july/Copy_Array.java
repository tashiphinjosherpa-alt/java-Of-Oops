package july;

import java.util.Scanner;

public class Copy_Array {
    public static void main(String[] args) {
        

int a[]= new int[5];
int b[]= new int[5];
Scanner r= new Scanner(System.in);
System.out.println("enter the value in the first array ");
for(int i=0; i<5;i++)
{
    a[i]=r.nextInt();
}
System.out.println("First array element");


for(int i=0;i<5;i++){
    System.out.println(a[i]+" ");
}
System.out.println("Second  array element");


for(int i=0;i<5;i++){

    b[i]=a[i];
    System.out.println(b[i]+" ");
}

    }
}
