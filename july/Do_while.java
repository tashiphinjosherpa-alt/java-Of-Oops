package july;

import java.util.Scanner;

public class Do_while {
    public static void main(String[] args) {
        Scanner ref= new Scanner(System.in);
        int num;

        do{
            System.out.println("enter a positive number");
            num=ref.nextInt();

        } while(num<=0);
        System.out.println("you entered a valid positive number "+num);
    }
}
