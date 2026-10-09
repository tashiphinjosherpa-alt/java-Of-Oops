package july;

import java.util.Scanner;

public class while_loop3 {
    public static void main(String[] args) {
        
        String input=" ";
        Scanner ref= new Scanner(System.in);


        while(!input.equals("Stop")){
            System.out.println("Enter the word you must like :");
            input=ref.nextLine();
        }
        System.out.println("Program ended . You typed 'stop");
    }
}
