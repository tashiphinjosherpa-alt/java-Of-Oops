package july;

import java.util.Scanner;

public class Get_User_input {
    public static void main(String[] args) {
        
Scanner ref=new Scanner(System.in);

System.out.println("Enter your naame: ");
String name= ref.nextLine();

System.out.println("Enter your age: ");
int age= ref.nextInt();

System.out.println(" Enter your favourite Decimal number: ");
double favourite=ref.nextDouble();

//display detail
System.out.println(" Now displaying the Details...");
System.out.println("name: "+name);
System.out.println("Age: "+age);
System.out.println("DEcimal number: "+favourite);


    }
}
