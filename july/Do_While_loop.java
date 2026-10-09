package july;

import java.util.Scanner;

public class Do_While_loop {
    public static void main(String[] args) {
        

        Scanner ref= new Scanner(System.in);
        String password;

        do{
            System.out.println("Enter your Password");
            password= ref.nextLine();
        }while(!password.equals("tashi@51"));

            System.out.println();

            System.out.println("Access granted! Correct password entered.");
    }
}
