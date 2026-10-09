import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        
        Scanner ref= new Scanner(System.in);

        System.out.println("ENter a number. ");
        int num= ref.nextInt();
        int originalNumber=num;
        int reversedNumber=0;

        while(num!=0)
        {
            int remainder= num%10;
            reversedNumber = reversedNumber*10+remainder;
            num= num/10;

        }
        if(originalNumber == reversedNumber){
            System.out.println(originalNumber+" is a palindrome number.");
        }
        else{
            System.out.println(originalNumber+" is not a palindrome number.");
        }
    }
}
