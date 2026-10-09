package july;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        
int a[]= new int[5];
Scanner r= new Scanner(System.in);
System.out.println("Enter eelement in array ");

for(int i=0; i<a.length;i++){
    a[i]=r.nextInt();
}
System.out.println("Array element ");
for(int i=0; i<a.length;i++)
{
    System.out.println(a[i]);
}
System.out.println("Array Length :"+a.length);

    }
}
