package july;

import java.util.Scanner;

public class Array_OF_Reverse {
    public static void main(String[] args) {
        
int a[]= new int [5];
Scanner r= new Scanner(System.in);
System.out.println("Ebnter element in array ");

for(int i=0;i<5;i++){

    a[i]=r.nextInt();
}
// display
System.out.println("Array Element:");


for(int i=0;i<5;i++){

    System.out.println(a[i]+"mmmmm");
}

System.out.println(" Reverse Array Element:");


for(int i=5-1;i>=0;i--){

    System.out.println(a[i]+"mmmmm");
}




    }
}
