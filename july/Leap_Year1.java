package july;

import java.util.Scanner;

public class Leap_Year1 {
    public static void main(String[] args) {
        
Scanner ref= new Scanner(System.in);

System.out.println("Enter a year: ");
int year = ref.nextInt();

if ((year%400==0)||(year%4==0 && year %100 !=0)) {

    System.out.println(year+ " is a leap year.");
    
}else{

    System.out.println(year+ " is not a leap year.");
}

    }
}
