package july;

import java.util.Scanner;

public class Do_While_loop1 {
    public static void main(String[] args) {
        
        Scanner ref= new Scanner(System.in);
        String sentence;

        do{
            System.out.println(" Enter the sentences that contain 'java' ");
            sentence= ref.nextLine();

            System.out.println();

        }while(!sentence.contains("java"));

        System.out.println();
        System.out.println("Great! you entered : " +sentence);
    }
}
