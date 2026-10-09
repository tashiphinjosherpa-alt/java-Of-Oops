package javaaa;

import java.util.Scanner;
public class calculator {
   public static void main(String[] args) {
    int result;

    Scanner ref=new Scanner(System.in);

    System.out.println("Enter first number ");
    int n1=ref.nextInt();

    System.out.println("Enter second number ");
    int n2=ref.nextInt();

    System.out.println(" Select symbol (-,+,/,%,*)");
    String sym=ref.next();

    switch(sym) {

    case "+": result=n1+n2;
    System.out.println(" positive result is "+result);
    break;

    case "-" : result=n1-n2;
    System.out.println(" negative result is " +result);
    break;

    case "/" : result=n1/n2;
    System.out.println("division result is " +result);
    break;

    default : System.out.println(" invalid");


    

    }








   } 
}
