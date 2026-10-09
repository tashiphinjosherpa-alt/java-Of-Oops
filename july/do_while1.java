package july;

import java.util.Scanner;

public class do_while1 {
    public static void main(String[] args) {
        
        Scanner ref= new Scanner(System.in);
        int number;

        do
        {

            System.out.println("enter a number: ");
            number=ref.nextInt();
        }while(number>=0);
        System.out.println("the required negtive number we need is found" +number);

    }
}
