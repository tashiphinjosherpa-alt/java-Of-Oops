package july;

import java.util.Scanner;

public class Break_Example1 {
    public static void main(String[] args) {
        
        Scanner ref= new Scanner(System.in);

        while(true){
            System.out.println("enter the word(type stop to end)");
            String word=ref.nextLine();

            if(word.equals("stop")){
                System.out.println("Loop stop by the User.");
                break;
            }
            System.out.println("You entered: "+word);
        }
        System.out.println("program finished");
    }

}
