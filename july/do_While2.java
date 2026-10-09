package july;

import java.util.Scanner;

public class do_While2 {
public static void main(String[] args) {
    
int num1,num2;
Scanner ref= new Scanner(System.in);

do{

    System.out.println("Enter two number : ");
    num1=ref.nextInt();
    num2=ref.nextInt();
}while((num1-num2)<=0);
System.out.println("the result is found positive and i.e :" +(num1-num2));
}
    
}
